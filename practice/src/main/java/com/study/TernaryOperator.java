package com.study;

public class TernaryOperator {
    private String name = "hulu";
    private static String toBePrinted = new TernaryOperator().name.equals("hulu") ? "Welcome" : "not welcomed";
    public static void main(String[] args) {
        
        System.out.println(toBePrinted);
    }
}
