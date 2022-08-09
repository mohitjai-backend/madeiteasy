using System;

class psp {
public static void Main() {
int x=1;
switch(x) {
case 1:
Console.WriteLine("Great");
goto case 9;
case 7:
Console.WriteLine("Great cool");
break;
case 9:
Console.WriteLine("cool Great");
break;
default:
Console.WriteLine("whatever");
break;
}
}
}