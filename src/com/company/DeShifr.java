package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

    public class DeShifr {

        public void iterations(char[] ch){
            char[] massive = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
            for (int i = 0; i < 33; i++) {
                System.out.println("\n\nСдвиг = " + i );
                for (int j = 0; j < ch.length; j++) {
                    if ((ch[j] == ' ') || (ch[j] == '\n') || (ch[j] == '.') || (ch[j] == ',')) {
                        System.out.print(ch[j]);
                    }
                    for (int k = 0; k < massive.length; k++){
                        if (ch[j] == massive[k]){
                            if (k + i < 33) {
                                System.out.print(massive[k + i]);
                            } else {
                                System.out.print(massive[(k + i) - 33]);
                            }
                        }
                    }
                }
            }
        }
    }



