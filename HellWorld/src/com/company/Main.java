package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Input date
        int[] myArray = new int[10];
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round(Math.random() * 10);
            System.out.println(myArray[i] + "");
        }

        Sorter sort = new Sorter(myArray);
        int []bubble = sort.bubbleSort();
        int []select = sort.selectSort();
        //int []vstavka = sort.vstavkaSort();

        int j, temp;
        for (int i = 0; i < myArray.length; i++){
            temp = myArray[i];
            for(j = i-1; j >= 0 && myArray[j] > temp; j--){
                myArray[j+1] = myArray[j];
            }
            myArray[j+1] = temp;
        }

        //Output date
        System.out.println();
        for(int i = 0; i < myArray.length;i++) System.out.println(bubble[i] + "");
        System.out.println();
        for(int i = 0; i < myArray.length;i++) System.out.println(select[i] + "");

    }
}