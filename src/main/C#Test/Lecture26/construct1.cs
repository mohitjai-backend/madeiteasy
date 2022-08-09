using System;
class aaa {
public aaa() {
Console.WriteLine("default constructor");
}

public aaa(int x):this() {
Console.WriteLine("parameterized constructor");
}
}

class psp {
public static void Main() {
aaa a1=new aaa();
aaa a2=new aaa(10);
}
}

// constructor can be called from another constructor.