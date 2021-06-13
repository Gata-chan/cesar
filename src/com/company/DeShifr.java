package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

    public class DeShifr {

        public void iterations(String ch){
            char[] massive = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
            char[] array = ch.toLowerCase(Locale.ROOT).toCharArray();
            for (int i = 0; i < 33; i++) {
                System.out.println("\n\nСдвиг = " + i );
                for (int j = 0; j < array.length; j++) {
                    if ((array[j] == ' ') || (array[j] == '\n') || (array[j] == '.') || (array[j] == ',')) {
                        System.out.print(array[j]);
                    }
                    for (int k = 0; k < massive.length; k++){
                        if (array[j] == massive[k]){
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



