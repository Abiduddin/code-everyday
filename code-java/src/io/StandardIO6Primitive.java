package io;

import java.io.*;

public class StandardIO6Primitive {
    public static void main(String[] args) {
        String destFileName = "primitivs.data";

        writeStream(destFileName);
        readStream(destFileName);
    }

    private static void readStream(String destFileName) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(destFileName));

            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            long longValue = dis.readLong();
            int intValue2 = dis.readInt();

            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(longValue);
            System.out.println(intValue2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeStream(String destFileName) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(destFileName));
            dos.writeInt(152);
            dos.writeDouble(4.56);
            dos.writeBoolean(true);
            dos.writeLong(Long.MAX_VALUE);
            dos.writeInt(9999);

            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
