using System;
class aaa {
public void sam(out int e) {
e=50;
}
}

class psp {
public static void Main(string [] args) {
aaa a = new aaa();
int x;
x=20;
a.sam(out x);
Console.WriteLine(x);
}
}

// 50 will get printed.








