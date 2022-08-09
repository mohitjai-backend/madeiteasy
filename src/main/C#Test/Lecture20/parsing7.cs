using System;
class aaa {
public void sam(ref int e) {
e=20;
}
}

class psp {
public static void Main(string [] args) {
aaa a = new aaa();
int x;
a.sam(ref x);
Console.WriteLine(x);
}
}

// code will not compile







