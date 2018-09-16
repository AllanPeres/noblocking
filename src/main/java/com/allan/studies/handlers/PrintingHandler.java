package com.allan.studies.handlers;

import java.io.IOException;

public class PrintingHandler<S> extends DecoratedHandler<S> {

    public PrintingHandler(Handler<S> other) {
        super(other);
    }

    @Override
    public void handle(S s) throws IOException {
        try {
            System.out.println("Connected from " + s);
            super.handle(s);
        } finally {
            System.out.println("Disconnected from " + s);
        }
    }
}
