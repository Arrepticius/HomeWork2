package com.practice;

/*Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент

последовательности Фибоначчи для вычисления пятнадцатого элемента.
 */
public class Fibonacci2 {

    public static void main(String[] args) {
        Fibonacci2 fib2 = new Fibonacci2();
        int f1 = 15;
        long fib = fib2.countFourFib(f1);
        int f2 = 4;
        long fb = fib2.countFourFib(f2);
        int count = (int)(fib/fb);

        System.out.println(count);

    }

    private int countFourFib(int f) {
        if(f < 1){
            return f;
        }
        return countFourFib(f - 1) + countFourFib(f - 2);
    }
}
