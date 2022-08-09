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
x=10;
a.sam(x);
Console.WriteLine(x);
}
}

// Argument `#1' is missing `ref' modifier







