package com.practice;

import java.util.Scanner;

/*
Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму

чисел от 1 до n;
 */
public class From0toN {

    private int customN;                                //объявляем переменные
    Scanner scanner = new Scanner(System.in);

    private int getCustomN() {
        System.out.print("Enter the number: ");     //просим ввести число
        customN = scanner.nextInt();                //записываем в переменную
        return customN;
    }

    public static void main(String[] args) {
        From0toN f = new From0toN();
        System.out.print("Sum is: " + f.getSumN(f.getCustomN()));       //выводим на экран


    }

   int getSumN(int a) {                     //подсчитываем сумму от 0 до N
        int sum = 0;
        if (a < 1) return sum;
        sum = getSumN(a - 1)+a;

        return sum;
    }
}
