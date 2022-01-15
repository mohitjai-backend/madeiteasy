package main.java.designpatterns.FactoryPattern;

interface Bank {
    int getInterestRate();
}

public class FactoryPattern {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        Bank hdfcBank = factoryProvider.getBank("hdfc");
        Bank sbiBank = factoryProvider.getBank("sbi");
        Bank iciciBank = factoryProvider.getBank("icici");

        System.out.println(hdfcBank.getInterestRate());
        System.out.println(sbiBank.getInterestRate());
        System.out.println(iciciBank.getInterestRate());
    }
}

class FactoryProvider {
    public Bank getBank(String name) {
        if (name.equalsIgnoreCase("hdfc")) {
            return new HDFCBank();
        }
        if (name.equalsIgnoreCase("sbi")) {
            return new SBIBank();
        }
        if (name.equalsIgnoreCase("icici")) {
            return new ICICBank();
        }
        return null;
    }
}

class HDFCBank implements Bank {

    @Override public int getInterestRate() {
        System.out.println("HDFC bank interest rate");
        return 6;
    }
}

class ICICBank implements Bank {
    @Override public int getInterestRate() {
        System.out.println("ICICI bank interest rate");
        return 7;
    }
}

class SBIBank implements Bank {
    @Override public int getInterestRate() {
        System.out.println("SBI bank interest rate");
        return 8;
    }
}

// https://techblogstation.com/java/factory-design-pattern-java/
