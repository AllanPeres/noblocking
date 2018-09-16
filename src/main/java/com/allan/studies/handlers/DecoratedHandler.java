package com.allan.studies.handlers;

import java.io.IOException;

// Decorator common abstract super class
public abstract class DecoratedHandler<S> implements Handler<S> {

    private final Handler<S> other;

    protected DecoratedHandler(Handler<S> other) {
        this.other = other;
    }

    public void handle(S s) throws IOException {
        other.handle(s);
    }
}
