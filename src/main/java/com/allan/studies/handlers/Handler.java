package com.allan.studies.handlers;

import java.io.IOException;

// Decorator design pattern
public interface Handler<S> {

    void handle(S s) throws IOException;
}
