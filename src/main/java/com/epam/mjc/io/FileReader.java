package com.epam.mjc.io;


import java.io.*;
import java.util.HashMap;


public class FileReader {
    public Profile getDataFromFile(File file) {
        String email= "";
        int age = 0;
        String name = "";
        Long phone = 0L;
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            int ch;
            String[][] profils = new String[4][];
            String text = "";

            while ((ch=fileInputStream.read())!=-1){
                text = text +((char) ch);
            }
            String[] rows = text.split("\n");
            HashMap<String, String> gatavs = new HashMap<>();
            for(int i = 0; i< rows.length; i++){
                String[] profileText = rows[i].split(" ");
                gatavs.put(profileText[0],profileText[1]);
            }
            email = gatavs.get("Email:").trim();
            age = Integer.parseInt(gatavs.get("Age:").trim());
            name = gatavs.get("Name:").trim();
            phone = Long.valueOf(gatavs.get("Phone:").trim());

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }

        return new Profile(name, age, email, phone);
    }
}
