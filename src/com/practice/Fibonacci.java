package com.practice;

/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что

первый и второй члены последовательности равны единицам, а каждый следующий — сумме

двух предыдущих.
 */
public class Fibonacci {

    public static void main(String[] args) {

        for (int i = 1; i <= 11; i++)                               //выводим последовательность
            System.out.print(getFibonacci(i) + " ");

    }

    private static int getFibonacci(int f) {                   //пишем метод вычисления числа Фибоначи
        if (f <= 1) {
            return f;
        } else return getFibonacci(f - 1) + getFibonacci(f - 2);
    }

}
