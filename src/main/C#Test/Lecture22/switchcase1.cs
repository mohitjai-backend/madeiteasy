using System;

class psp {
public static void Main() {
int x=10;
switch(x) {
case 1:
Console.WriteLine("Great");
case 7:
Console.WriteLine("Great cool");
case 9:
Console.WriteLine("cool Great");
default:
Console.WriteLine("whatever");
}
}
}

//compile time error => main.cs(7,1): error CS0163: Control cannot fall through from one case label `case 1:' to another