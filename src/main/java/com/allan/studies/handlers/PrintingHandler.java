package com.allan.studies.handlers;

import java.io.IOException;

public class PrintingHandler<S> implements Handler<S> {

    private final Handler<S> other;

    public PrintingHandler(Handler<S> other) {
        this.other = other;
    }

    @Override
    public void handle(S s) throws IOException {
        try {
            System.out.println("Connected from " + s);
            other.handle(s);
        } finally {
            System.out.println("Disconnected from " + s);
        }
    }
}
