package com.course.syntax;
import java.util.Scanner;
public class StepThreeTaskTwo {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("Вы ввели число " + number);
        if (number % 2 == 0) {
            System.out.print("парное число");
        }
        else if (number % 2 != 0) {
            System.out.print("не парное число");
        }
    }

}
