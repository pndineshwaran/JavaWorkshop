package com.techatpark.practices.basics.codeGen;

public class genMethod {
    static <V> void display(V value){
        System.out.println("type of valbe" + value.getClass().getName() + "value is " + value);
    }

    public static void main(String[] args) {
        display("1000");
        display("PND");
        display("2.014");

    }
}
