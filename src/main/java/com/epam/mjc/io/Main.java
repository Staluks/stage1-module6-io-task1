package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        FileReader kaka = new FileReader();
        File file = new File("C:\\Users\\37128\\IdeaProjects\\stage1-module6-io-task1\\src\\main\\resources\\Profile.txt");
        kaka.getDataFromFile(file);
    }
}
