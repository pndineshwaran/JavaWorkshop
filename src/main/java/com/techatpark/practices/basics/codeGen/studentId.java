package com.techatpark.practices.basics.codeGen;

public class studentId {
    public static void main(String[] args) {

        pair<String, Integer> getstudent = new pair<>();
        getstudent.setKey("ram");
        getstudent.setValue(66666);
        System.out.println("Name " + getstudent.getKey() + "id" + getstudent.getValue());
    }
}
