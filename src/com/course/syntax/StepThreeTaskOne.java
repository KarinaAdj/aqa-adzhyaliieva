package com.course.syntax;
import java.util.Scanner;
public class StepThreeTaskOne {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);

        if (number < 10) {
            System.out.println("first message");
        }
        else if (number > 10) {
            System.out.println("second message");
        }
        else if (number == 0) {
            System.out.println("third message");
        }
    }
}
