package com.techatpark.practices.basics.exhandle;

import java.util.List;

public class erorr {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        try {
        extracted();
//        }
//        catch (ClassNotFoundException cnf) {
//            cnf.printStackTrace();
//            System.out.println(cnf.getMessage());
//        }
//        catch (InstantiationException exception) {
//            exception.printStackTrace();
//            System.out.println(exception.getMessage());
//        }
//        catch (IllegalAccessException exception) {
//            exception.printStackTrace();
//            System.out.println(exception.getMessage());
//        }
        System.out.println("Ending here....");
    }

    private static void extracted() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        List list = (List) Class.forName("java.util.ArrayLst").newInstance();
        list.add("Ram");
        list.add("vijay");
        list.add(123456);
        System.out.println(list);
    }
}

