package com.streams;
import java.io.*;

public class FileCopyPerformance {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    // Unbuffered copy
    static long copyUnbuffered(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        long start = System.nanoTime();
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();
        fis.close();
        fos.close();

        return end - start;
    }

    // Buffered copy
    static long copyBuffered(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        long start = System.nanoTime();
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();
        bis.close();
        bos.close();

        return end - start;
    }

    public static void main(String[] args) throws IOException {

        String source = "source_100MB.bin";
        String unbufferedDest = "unbuffered_copy.bin";
        String bufferedDest = "buffered_copy.bin";

        long unbufferedTime = copyUnbuffered(source, unbufferedDest);
        long bufferedTime = copyBuffered(source, bufferedDest);

        System.out.println("Unbuffered Time (ms): " + unbufferedTime / 1_000_000);
        System.out.println("Buffered Time (ms):   " + bufferedTime / 1_000_000);
    }
}
