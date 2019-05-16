package com.company;

import java.util.Random;

public class Main {
    public static long mainSum = 0;

    public static void main(String[] args) throws InterruptedException {
        //завести массив на ~1 000 000 элементов,
        //заполнить рандомно
        //завести n штук CounterThread'ов,
        //выделив каждому кусок массива,
        //сумму которого он считает
        //запустить каждый, дождаться окончания
        //работы всех тредов => получили сумму в
        //переменной mainSum
        //Для проверки прямо в main'e посчитайте
        //сумму обычным for'ом по всему массиву
        //сравните полученные результаты
        int n = 1000000;
        int[] arr = new int[n];
//        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = 2;
        }
        long simplesum = 0;
        for (int i = 0; i < n; i++) {
            simplesum += arr[i];
        }
        CounterThread cn1 = new CounterThread(0,250000,arr);
        cn1.start();
        cn1.join();
        CounterThread cn2 = new CounterThread(250000,500000,arr);
        cn2.start();
        CounterThread cn3 = new CounterThread(500000,750000,arr);
        cn3.start();
        CounterThread cn4 = new CounterThread(750000,1000000,arr);
        cn4.start();
        cn2.join();
        cn3.join();
        cn4.join();
        System.out.println(simplesum);
        System.out.println(mainSum);

    }
}
