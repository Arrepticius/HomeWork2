/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его

цифр (заранее не известно сколько цифр будет в числе).
 */
package com.practice;

import java.util.Scanner;

public class SumOfN {

    private int customN;                                          //объявляем переменные
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        SumOfN sumN = new SumOfN();

        System.out.println("Summ is: " + sumN.getSum(getN()));      //выводим результат

    }

    private int getSum(int n) {                                 //вычисляем сумму цифр числа N

        int summ = 0;
        while (n != 0) {
            summ = summ + n % 10;
            n /= 10;
        }
        return summ;
    }

    private static int getN() {                                     //запрашиваем число
        SumOfN s = new SumOfN();
        System.out.print("Enter the number: ");
        s.customN = scanner.nextInt();
        return s.customN;
    }
}
