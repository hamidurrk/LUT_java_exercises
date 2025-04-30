package com.study;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);
        String xx = scanner.next();
        System.out.println(xx);
        int y = scanner.nextInt();
        System.out.println(y);
        scanner.close();
    }
}
