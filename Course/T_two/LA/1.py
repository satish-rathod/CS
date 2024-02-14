import numpy as np
from PIL import ImageDraw, Image


class ImageCompression:
    
    def __init__(self, image_path):
        self.image_path = image_path
        self.original_image = Image.open(image_path)
        self.width, self.height = self.original_image.size

    def compress(self, compression_ratio):
        # Convert image to numpy array
        image_array = np.array(self.original_image)

        # Perform SVD on each channel
        compressed_channels = []
        for channel in range(3):
            U, S, V = np.linalg.svd(image_array[:,:,channel], full_matrices=False)
            # Reduce singular values for compression
            num_singular_values = int(len(S) * compression_ratio)
            compressed_S = np.zeros_like(S)
            compressed_S[:num_singular_values] = S[:num_singular_values]
            # Reconstruct the compressed channel
            compressed_channel = np.dot(U, np.dot(np.diag(compressed_S), V))
            compressed_channels.append(compressed_channel)

        # Combine compressed channels
        compressed_image = np.stack(compressed_channels, axis=-1)

        return Image.fromarray(compressed_image.astype('uint8'))

    def add_watermark(self, image, watermark_text):
        # Add watermark text to the image
        watermark_image = Image.new("RGB", (self.width, self.height), (255, 255, 255))
        watermark_draw = ImageDraw.Draw(watermark_image)
        watermark_draw.text((10, 10), watermark_text, fill=(0, 0, 0))
        # Blend watermark with the compressed image
        return Image.blend(image, watermark_image, alpha=0.5)

if __name__ == "__main__":
    
    image_path = input("image path: ")
    compression_ratio = int (input("Enter compression ratio (between 0 and 1): ")) / 10
    watermark_text = input("digital watermark: ")

    compression_app = ImageCompression(image_path)
    compressed_image = compression_app.compress(compression_ratio)
    watermarked_image = compression_app.add_watermark(compressed_image, watermark_text)

    # Save or display the compressed and watermarked image
    watermarked_image.save("compressed_watermarked_image.jpg")
    watermarked_image.show()
