package com.streams;
import java.io.*;
import java.util.Arrays;

public class ImageByteArrayDemo {

    public static void main(String[] args) {

        String sourceImage = "original.jpeg";
        String copiedImage = "copied.jpeg";

        try {
            // Read image into ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to image using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(copiedImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            // Verification
            boolean isSame = Arrays.equals(
                    imageBytes,
                    readBytesFromFile(copiedImage)
            );

            System.out.println("Files identical: " + isSame);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method for verification
    static byte[] readBytesFromFile(String file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();
        baos.close();

        return baos.toByteArray();
    }
}
