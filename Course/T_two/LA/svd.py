import numpy as np
from PIL import ImageDraw, Image


class ImgCompress:
    
    def __init__(self, img_path):
        self.img_path = img_path

    @property
    def original_img(self):
        if not hasattr(self, '_original_img'):
            self._original_img = Image.open(self.img_path)
        return self._original_img

    @property
    def width(self):
        return self.original_img.size[0]

    @property
    def height(self):
        return self.original_img.size[1]

    def compress(self, comp_ratio):
        img_array = np.array(self.original_img)
        comp_channels = []
        for ch in range(3):
            U, S, V = np.linalg.svd(img_array[:,:,ch], full_matrices=False)
            num_singular_values = int(len(S) * comp_ratio)
            comp_S = np.zeros_like(S)
            comp_S[:num_singular_values] = S[:num_singular_values]
            comp_ch = np.dot(U, np.dot(np.diag(comp_S), V))
            comp_channels.append(comp_ch)
        comp_img = np.stack(comp_channels, axis=-1)
        return Image.fromarray(comp_img.astype('uint8'))

    def add_watermark(self, img, watermark_text):
        watermark_img = Image.new("RGB", (self.width, self.height), (255, 255, 255))
        watermark_draw = ImageDraw.Draw(watermark_img)
        watermark_draw.text((10, 10), watermark_text, fill=(0, 0, 0))
        return Image.blend(img, watermark_img, alpha=0.5)

if __name__ == "__main__":
    
    img_path = input("image path: ")
    comp_ratio = int(input("Enter compression ratio (between 1 and 10): ")) / 10
    watermark_text = input("digital watermark: ")

    img_compress = ImgCompress(img_path)
    comp_img = img_compress.compress(comp_ratio)
    watermarked_img = img_compress.add_watermark(comp_img, watermark_text)

    watermarked_img.save("compressed_watermarked_img.jpg")
    watermarked_img.show()
