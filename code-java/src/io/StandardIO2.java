package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardIO2 {
    public static void main(String[] args) {

        startBufferReader();
        startScanner();
    }

    private static void startScanner() {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            line = scanner.nextLine();
            System.out.println(line);
        } while (!line.equals("quit"));
    }

    public static void startBufferReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {
            do {
                line = reader.readLine();
                line = line.toLowerCase();
                System.out.println(line);
            } while (!line.equals("quit"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

