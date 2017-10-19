package ru.reeson2003.datagram;

import java.io.IOException;

/**
 * Created by Pavel Gavrilov on 19.10.2017.
 */
public class DatagramServer {
    public static void main(String[] args) throws IOException {
        new QuoteServerThread().start();
    }
}
