package main.java.designpatterns.singletonpattern;

public class LazyInitializationSingletonExample {
    public static void main(String[] args) {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {

    }

    public static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
            return instance;
        }

        return instance;
    }
}

// https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

/*
The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems,
it can cause issues if multiple threads are inside the if condition at the same time.
It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
 */
