using System;
class psp {
public static void Main(string [] args) {

int x,y;
try {
x = System.Int32.Parse(args[0]);
y = System.Int32.Parse(args[1]);
System.Console.WriteLine("result is: "+ (x/y));
}
catch(DivideByZeroException) {
System.Console.WriteLine("can not divide by zero");
return;
}
}
}



