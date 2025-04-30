package com.study;
import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        switch(name) {
            case "hamidur":
                System.out.println("Hello!");
                break;
            case "hulu":
                System.out.println("Go away!");
                break;
            default:
                System.out.println("Try again later.");
                break;
        }
    }
}
