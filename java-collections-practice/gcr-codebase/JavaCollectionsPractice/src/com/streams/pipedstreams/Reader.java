package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

class Reader implements Runnable {

    private PipedInputStream pis;

    Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
