package com.streams.pipedstreams;
import java.io.*;

public class PipedStreamDemo {

    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writerThread = new Thread(new Writer(pos));
        Thread readerThread = new Thread(new Reader(pis));

        writerThread.start();
        readerThread.start();
    }
}
