package main.java.multithreading;

public class SumOfNNumbersSimple {
    public static void main(String[] args) {
        SumOfNNumbersSimple obj = new SumOfNNumbersSimple();
        int totalUsers = 500;
        int users[] = new int[totalUsers];
        for(int i=0;i<users.length;i++)
            users[i]=i+1;
        int n=10;
        long startTime = System.nanoTime();
        for(int i=0;i<users.length;i++) {
            System.out.println("User:"+users[i]+" sum=> "+obj.sum(n));
        }
        long endTime = System.nanoTime();
        System.out.print("Time taken in nano seconds: ");
        System.out.println((endTime-startTime));
    }

    int sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum+i;
        }

        return sum;
    }

}
