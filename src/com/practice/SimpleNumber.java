package com.practice;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с

клавиатуры). Результат должен быть: 2,3,5,7 ...
 */
public class SimpleNumber {

    private int customN;
    Scanner scn = new Scanner(System.in);

    private int getSimpleNum(int s) {
        if(s<3){
            return s;
        }
        int divident = 0;
        for (int i = 1; i <= s; i++) {
            if ((s % i) == 0) {
                divident++;
            }

        }
        if(divident < 3) System.out.print(s + " ");
        return getSimpleNum(s - 1);
    }

    private int getCustomN() {
        System.out.print("Enter the number: ");
        customN = scn.nextInt();
        return customN;
    }

    public static void main(String[] args) {
        SimpleNumber simpNum = new SimpleNumber();

            System.out.print(simpNum.getSimpleNum(simpNum.getCustomN()) + " ");

    }
}

