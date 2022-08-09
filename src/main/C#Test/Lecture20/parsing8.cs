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
a.sam(ref x);
Console.WriteLine(x);
}
}

// 10 will get printed.

/*
jisko pass kr rhe wha assignment jaruri nahi but jha se paas kr rhe wha assignment jaruri hai.
*/







