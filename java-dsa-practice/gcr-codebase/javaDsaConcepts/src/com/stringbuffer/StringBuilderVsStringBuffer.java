package com.stringbuffer;

public class StringBuilderVsStringBuffer {

    public static void main(String[] args) {

        int n = 1_000_000;

        // -------- StringBuilder Test --------
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- StringBuffer Test --------
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // -------- Output --------
        System.out.println("Time taken by StringBuilder (ns): " + builderTime);
        System.out.println("Time taken by StringBuffer  (ns): " + bufferTime);
    }
}

