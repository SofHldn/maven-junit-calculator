package se.iths;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(5,7));
        System.out.println(subtract(5,7));
        System.out.println(multiply(5,7));
        System.out.println(divide(10,5));

    }

    public static int add (int a, int b){
        return a+b;
    }
    public static int subtract (int a, int b){
        return a-b;
    }
    public static int multiply (int a, int b){
        return a*b;
    }
    public static int divide (int a, int b){
        return a/b;
    }


}
