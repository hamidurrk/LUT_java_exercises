package com.study;

public class DataTypes {
    public static void main(String[] args) {
        String string = new String("Hello!");
        int x = 5;
        Integer y = 6; 
        System.out.println(string);
        System.out.println(x);
        System.out.println(y);

        // Primitive types
        // boolean
        // byte - 8 bit
        // char - 16 bit
        // short - 16 bit
        // int - 32 bit
        // long - 64 bit
        // float - 32 bit
        // double - 64 bit
        boolean bool = true;
        byte bb = 127;          // can store upto a byte i.e. 127
        byte b = 'C';           // characters stored here are ascii
        char c = 'z';           // characters stored here are unicode
        short s = -32768;       // twice the size of byte
        short ss = 32767;
        int i = 212312312;      // 32 bit number
        long l = 12312312312L;  // if outside the range of int, use 'L' in the end

        float f = 20.5f;        // less precision
        double d = 20.5;        // more precision
        double dd = 20.5f;      // it still uses float inside f

        float result = (float) (dd / s);
    }
}
