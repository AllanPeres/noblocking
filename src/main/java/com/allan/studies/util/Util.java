package com.allan.studies.util;

import java.nio.ByteBuffer;

public class Util {
    public static int transmografy(int data) {
        return Character.isLetter(data) ? data ^ ' ' : data;
    }

    public static void transmografy(ByteBuffer buf) {
        // pos = 0, limit = 80, capacity = 80
        // "hello\n" pos=6, limit=80, capacity=80
        buf.flip();
        // "hello\n" pos=0, limit=6, capacity=80
        for (int i = 0; i < buf.limit(); i++) {
            buf.put(i, (byte)transmografy(buf.get(i)));
        }
    }
}
