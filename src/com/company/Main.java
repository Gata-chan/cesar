package com.company;

public class Main {

    public static void main(String[] args) {
        String path;
        Reader reader = new Reader();
        DeShifr deCipher;
        deCipher = new DeShifr();

        path = "src/com/company/cipher.txt";
        deCipher.iterations(reader.readFile(path));
    }
}
