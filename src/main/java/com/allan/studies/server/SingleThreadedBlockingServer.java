package com.allan.studies.server;

import com.allan.studies.handlers.Handler;
import com.allan.studies.handlers.PrintingHandler;
import com.allan.studies.handlers.TransmogrifyHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadedBlockingServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Handler<Socket> handler =
                new PrintingHandler<>(
                    new TransmogrifyHandler()
                );
        while(true) {
            Socket s = ss.accept();
            handler.handle(s);
        }
    }

}
