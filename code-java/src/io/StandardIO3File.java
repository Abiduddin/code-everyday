package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StandardIO3File {
    public static void main(String[] args) throws IOException {
        File dir = new File("~/home/test");

        dir.mkdirs();

        String dirPath = dir.getPath();
        System.out.println("Directory Path: " + dirPath);

        // lets create a new file
        String fileName = "hello.txt";
        File file = new File(dirPath + File.separator + fileName);
        file.createNewFile();

        String filePath = file.getPath();
        System.out.println("File Path: "+ filePath);
    }
}
