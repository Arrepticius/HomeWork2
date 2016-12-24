package com.practice;

import java.util.Random;

/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из

отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с

наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести

индекс первой встретившейся из них.
 */
public class MyArray2 {

    public static void main(String[] args) {
        int[][] arrayInt = new int[7][4];                   //массив чисел в диапозоне [-5;5]
        int[] arrayMax = new int[arrayInt.length];           //массив для хранения результата перемножения


        for (int i = 0; i < 7; i++) {                         //заполняем массив случайными числами
            for (int j = 0; j < 4; j++) {
                arrayInt[i][j] = (int)(Math.random()*11)-5;
            }
        }

        for (int i = 0; i < 7; i++) {                              //выводим массив на экран
            for (int j = 0; j < arrayInt[i].length; j++) {

                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < arrayInt.length; i++) {             //заполняем дополнительный массив
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (j == 0) {
                    arrayMax[i] = arrayInt[i][j];
                } else
                    arrayMax[i] *= arrayInt[i][j];
            }
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < arrayMax.length; i++) {         //ищем строку с наибольшим произведением
            if (Math.abs(arrayMax[i]) > max) {
                max = arrayMax[i];
                count = i;
            }
        }

        System.out.println("The line which contain max number: " + max + " have index: " + count); //выводим на экран

    }

}
