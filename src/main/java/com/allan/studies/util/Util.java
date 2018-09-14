package com.allan.studies.util;

public class Util {
    public static int transmografy(int data) {
        return Character.isLetter(data) ? data ^ ' ' : data;
    }
}
