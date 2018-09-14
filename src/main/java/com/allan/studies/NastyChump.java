package com.allan.studies;

import java.io.IOException;
import java.net.Socket;

public class NastyChump {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket[] sockets = new Socket[300000];
        for (int i = 0; i < sockets.length; i++) {
            sockets[i] = new Socket("localhost", 8080);
        }
        Thread.sleep(100_000);
    }
}
