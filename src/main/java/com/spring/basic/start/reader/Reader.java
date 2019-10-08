package com.spring.basic.start.reader;

public final class Reader {
    final Book thebook;

    public Reader(final Book thebook) {
        this.thebook = thebook;
    }

    public void read() {
        System.out.println("Reading: " + thebook.getTitle());
    }
}
