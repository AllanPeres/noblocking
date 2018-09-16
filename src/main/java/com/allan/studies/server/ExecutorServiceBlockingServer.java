package com.allan.studies.server;

import com.allan.studies.handlers.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceBlockingServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Handler<Socket> handler =
            new ExecutorServiceHandler<>(
                new PrintingHandler<>(
                        new TransmogrifyHandler()
                ),
                // Using this will make open as many connections as possible
                Executors.newCachedThreadPool()
                // using this will cause only 10 connections be made
                //Executors.newFixedThreadPool(10)
            );
        while(true) {
            Socket s = ss.accept();
            handler.handle(s);
        }
    }

}
