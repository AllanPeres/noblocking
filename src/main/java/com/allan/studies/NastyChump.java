package com.allan.studies;

import java.io.IOException;
import java.net.Socket;

public class NastyChump {

    public static void main(String[] args) throws InterruptedException {
        Socket[] sockets = new Socket[300_000_000];
        for (int i = 0; i < sockets.length; i++) {
            try {
                sockets[i] = new Socket("localhost", 8080);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(100_000);
    }
}
