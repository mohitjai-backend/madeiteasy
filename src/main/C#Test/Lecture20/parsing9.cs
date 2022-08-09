using System;
class aaa {
public void sam(ref int e) {

}
}

class psp {
public static void Main(string [] args) {
aaa a = new aaa();
int x;
x=10;
a.sam(ref 20);
Console.WriteLine(x);
}
}

// this is wrong. A ref or out argument must be an assignable variable









