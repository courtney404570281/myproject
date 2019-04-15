package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {

        // File jkDir = new File("D:\\jk");
        // jkDir.mkdir();
        // FileWriter fw = new FileWriter("D:\\jk\\output.txt");

        FileWriter fw = new FileWriter("output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();

    }
}
