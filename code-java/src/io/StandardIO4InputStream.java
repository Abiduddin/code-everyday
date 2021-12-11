package io;

import java.io.FileInputStream;
import java.io.IOException;

public class StandardIO4InputStream {

    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("/home/abid/workspace/personal/code-everyday/code-java/src/io/hello.txt");
            int c;

            while ((c = in.read()) != -1) {
                System.out.print((char) c + ",");
            }
        } catch (IOException e) {
            System.err.println("Could not read file");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                    System.err.println("Could close input stream");
                }
            }
        }
    }
}
