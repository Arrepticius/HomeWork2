package com.practice;

import java.util.Random;

/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из

отрезка [10;99]. Вывести массив на экран.
 */
public class MyArray1 {

    public static void main(String[] args) {

        int[][] array = new int[8][5];                  //объявляем массив
        Random r = new Random();

        for (int i = 0; i < 8; i++) {                   //заполняем его случайными цифрами
            for (int j = 0; j < 5; j++) {
                array[i][j] = (r.nextInt(89) + 10);
            }
        }
        for (int i = 0; i < 8; i++) {                   //выводим массив на экран
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
