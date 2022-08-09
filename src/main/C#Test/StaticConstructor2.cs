class aaa {
private static int x;
public aaa () {
System.Console.WriteLine("default constructor");
}

static aaa() {
x=100;
System.Console.WriteLine("static constructor "+x);
}

public static void tim() {
System.Console.WriteLine("tim method");
}
}

class psp {
public static void Main() {
aaa a;
System.Console.WriteLine("great");
aaa.tim();
aaa obj1 = new aaa(); 
aaa obj2 = new aaa();
a = new aaa();
}
}

/*
great
static constructor 100
tim method
default constructor
default constructor
default constructor
*/

// whenever class is loaded first time, memory will get allocated for static members (for x, memory will be allocated then only value is assigned to x)
// and then static constructor gets called.
// static constructor must be parameter less.