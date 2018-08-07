package pl.coderslab;

import org.apache.commons.io.FileUtils;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int [10];
        for (int i = 0; i <10 ; i++) {

            tablica[i] = (random.nextInt(101)+1);
        }
        int[] odwr = new int[10];
        for (int i = 0; i < 10; i++) {
            odwr[i] = tablica[tablica.length - i -1];

        }

        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(odwr));
    }
}
