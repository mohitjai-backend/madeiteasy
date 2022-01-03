package main.java.designpatterns.singletonpattern;

public class EnumSingletonExample {
    public static void main(String[] args) {

        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println(instance1.getValue());
        instance2.setValue(2);
        System.out.println(instance1.getValue());
        System.out.println(instance2.getValue());
    }
}

enum SingletonEnum {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

// https://www.geeksforgeeks.org/advantages-and-disadvantages-of-using-enum-as-singleton-in-java/
