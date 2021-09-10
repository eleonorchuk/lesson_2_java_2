package ru.geekbrains.lesson_6;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // test task 1
        Random rnd = new Random();
        boolean result = testSumBetween1020(0,20);
        System.out.println("testSumBetween1020 returned " + result );
        result = testSumBetween1020(23,23);
        System.out.println("testSumBetween1020 returned " + result );
        result = testSumBetween1020(rnd.nextInt(30), rnd.nextInt(30));
        System.out.println("testSumBetween1020 returned " + result );

        // test task 2
        printNumberSign(20);
        printNumberSign(-120);
        printNumberSign(rnd.nextInt(100) - 50);

        // test task 3
        result = testInvertNumberSign(987);
        System.out.println("testInvertNumberSign returned " + result );
        result = testInvertNumberSign(-560);
        System.out.println("testInvertNumberSign returned " + result );
        result = testInvertNumberSign(rnd.nextInt(30) - 15);
        System.out.println("testInvertNumberSign returned " + result );

        // test task 4
        printStringNTimes("Java KOOL", 3);
        printStringNTimes("Java HARD", -1);
        printStringNTimes("Java Difficult", 0);
        printStringNTimes("Java it is interesting", 10);
        printStringNTimes("I love Java", rnd.nextInt(5) - 2);

    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
    */
    public static boolean testSumBetween1020(int a, int b) {
        System.out.println("testSumBetween1020");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int sum = a + b;
        System.out.println("sum = " + sum);
        System.out.print("(10 <= (" + a + " + " + b + ") <= 20) it is ");
        if ((sum >= 10) && (sum <= 20 )) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    */
    public static void printNumberSign(int a) {
        System.out.println("printNumberSign");
        System.out.println("a = " + a);

        if (a >= 0)
            System.out.println("Положительное число");
        else
            System.out.println("Отрицательное число");
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.
      */
    public static boolean testInvertNumberSign(int a) {
        System.out.println("testInvertNumberSign");
        System.out.println("a = " + a);

        return a < 0;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;
    */
    public static void printStringNTimes(String s, int a) {
        System.out.println("printStringNTimes");
        System.out.println("a = " + a);
        for(int i = 0; i < a; i++)
            System.out.println(s);
    }

}

