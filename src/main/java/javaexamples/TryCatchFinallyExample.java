package main.java.javaexamples;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        TryCatchFinallyExample obj = new TryCatchFinallyExample();
        System.out.println(obj.fun());
    }

    int fun() {
        try {
            int x = 1/0; // if you comment this line then there will be no output.
            System.exit(0);
            return 1;
        } catch (ArithmeticException e) {
            return 2;
        } finally {
            return 3;
        }
    }
}

// o/p=> 3

// https://stackoverflow.com/questions/2309964/multiple-returns-which-one-sets-the-final-return-value
// finally will get executed in last and will override value of try and catch, only in case of System.exit(), finally is not called.
