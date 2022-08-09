using System;

class psp {
public static void Main() {
int a=2147483645;
int b=30;
int c=(checked(a+b));
Console.WriteLine(c);
}
}

// overflow exception,, can be handled using try catch