package io;

import java.io.File;
import java.io.IOException;

public class Io1 {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist,lets create one");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
