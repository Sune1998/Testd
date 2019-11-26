package com.company;

import java.util.Scanner;


public class Main {
static boolean a;
static Boolean b;

static int num = 12;
static Integer wrap =12;
    public static void main(String[] args) {
	// write your code here
        while (true) {
            System.out.println("Write a number");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            try {
                System.out.println(100 / num);

            }
            catch (ArithmeticException q) {
                System.out.println("ERROR 420, RTFM" + q);
            }

            if (num == -10) {break;}

        }
    }
}
