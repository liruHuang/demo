package com.example.demo.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("/Users/huangliru/Desktop/jk");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("/Users/huangliru/Desktop/jk/dat.txt");
        fw.write("abc");
        fw.flush();
        fw.close();


    }
}
