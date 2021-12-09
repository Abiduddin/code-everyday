package io;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class StandardIO3File {
    public static void main(String[] args) throws IOException {
        File dir = new File("~/home/test");

        dir.mkdirs();

        String dirPath = dir.getPath();
        System.out.println("Directory Path: " + dirPath);

        File file = createFile(dirPath);

        String filePath = file.getPath();
        System.out.println("File Path: "+ filePath);

        showFiles(dir);
    }

    private static File createFile(String dirPath) throws IOException {
        String fileName = UUID.randomUUID().toString()+".txt";
        File file = new File(dirPath + File.separator + fileName);
        file.createNewFile();
        return file;
    }

    private static void showFiles(File dir) {
        File[] listRoots = dir.listFiles();
        for (File file1 : listRoots) {
            System.out.println(file1.getPath());
        }
    }
}
