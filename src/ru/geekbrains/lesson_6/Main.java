package ru.geekbrains.lesson_6;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rnd = new Random();
        boolean result = test_sum_between_10_20(0,20);
        System.out.println("test_sum_between_10_20 returned " + result );
        result = test_sum_between_10_20(23,23);
        System.out.println("test_sum_between_10_20 returned " + result );
        result = test_sum_between_10_20(rnd.nextInt(30), rnd.nextInt(30));
        System.out.println("test_sum_between_10_20 returned " + result );
    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
    */
    public static boolean test_sum_between_10_20(int a, int b) {
        System.out.println("test_sum_between_10_20");
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
}
