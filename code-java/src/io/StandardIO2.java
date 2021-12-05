package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        do {
            line = reader.readLine();
            line = line.toLowerCase();
            System.out.println(line);
        } while (!line.equals("quit"));
    }
}

