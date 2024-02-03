import cv2
import numpy as np

def compress_image(image_path, compression_ratio, fingerprint=None):
    # Load the image
    original_image = cv2.imread(image_path)

    # Convert the image to RGB
    original_image = cv2.cvtColor(original_image, cv2.COLOR_BGR2RGB)

    # Perform SVD on each color channel separately
    compressed_channels = []
    for channel in range(3):
        U, S, Vt = np.linalg.svd(original_image[:, :, channel], full_matrices=False)
        k = int(S.shape[0] * compression_ratio)

        # Truncate singular values
        compressed_S = np.diag(S[:k])

        # Reconstruct the channel
        compressed_channel = np.dot(U[:, :k], np.dot(compressed_S, Vt[:k, :]))

        compressed_channels.append(compressed_channel)

    # Stack the compressed channels to get the compressed image
    compressed_image = np.stack(compressed_channels, axis=-1)

    # Add a digital fingerprint if provided
    if fingerprint is not None:
        compressed_image = np.bitwise_xor(compressed_image, fingerprint)

    return compressed_image.astype(np.uint8)

def save_compressed_image(compressed_image, output_path):
    # Save the compressed image
    cv2.imwrite(output_path, cv2.cvtColor(compressed_image, cv2.COLOR_RGB2BGR))

if __name__ == "__main__":
    # Input parameters
    image_path = "path/to/your/image.jpg"
    compression_ratio = 0.5  # Adjust the compression ratio as needed
    fingerprint = None  # You can add a digital fingerprint if needed

    # Perform compression
    compressed_image = compress_image(image_path, compression_ratio, fingerprint)

    # Save the compressed image
    output_path = "path/to/your/compressed_image.jpg"
    save_compressed_image(compressed_image, output_path)
