package main.java.javaexamples;

public class OverloadingExample {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.fun(null);
    }
}

class Overload {
    public void fun(String s) {
        System.out.println("string");
    }

    public void fun(Object o) {
        System.out.println("object");
    }
}

// most specific will get called, in this case "String" will get called
