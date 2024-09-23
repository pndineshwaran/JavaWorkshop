package com.techatpark.practices.basics.exhandle;

public class Arith {
    public static int display (int i, int j) {
        int x = 0;
        try {
            x = i / j;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Cannot show the ans ");
        } finally {
            System.out.println("final !");
        }
        System.out.println("Output .... ");
        return x;
    }
    public static void main(String[] args) {

        int PND = display(2, 0);
        System.out.println(PND);



    }
}
