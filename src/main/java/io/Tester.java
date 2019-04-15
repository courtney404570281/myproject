package io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            System.out.println(n);
            System.out.println(is.read());
            System.out.println(is.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
