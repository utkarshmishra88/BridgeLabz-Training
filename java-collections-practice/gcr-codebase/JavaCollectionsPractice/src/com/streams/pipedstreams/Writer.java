package com.streams.pipedstreams;
import java.io.IOException;
import java.io.PipedOutputStream;

class Writer implements Runnable {

    private PipedOutputStream pos;

    Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String msg = "Hello from Writer Thread";
            pos.write(msg.getBytes());
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
