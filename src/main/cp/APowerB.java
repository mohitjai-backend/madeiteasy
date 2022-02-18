package main.cp;

public class APowerB {
    public static void main(String[] args) {
        APowerB obj = new APowerB();
        long mod = 1000000007;
        System.out.println(obj.aPowerB(2, 50, mod));
    }

    long aPowerB(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) { // if(b&1) || if ((b & 1) != 0) || if (b%2 != 0)
                res = (res * a) % mod;
            }

            a = (a * a) % mod;
            b = b >> 1;
        }

        return res;
    }
}
