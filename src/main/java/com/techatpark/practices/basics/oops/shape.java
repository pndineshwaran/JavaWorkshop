package com.techatpark.practices.basics.oops;

public class shape {
    public static int findarea(int area){
        return area*area;
    }
    public static int findarea(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Area OF SQUARE: " + findarea(5));
        System.out.println("Area OF rectangle: " + findarea(5,4));

    }
}

