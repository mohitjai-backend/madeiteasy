using System;
class psp {
public static void Main(string [] args) {

int x,y;
try {
x = System.Int32.Parse(args[0]);
y = System.Int32.Parse(args[1]);
System.Console.WriteLine("sum is: "+ (x+y));
}
catch(FormatException) {
System.Console.WriteLine("either one is not number " + args[0] + "  " + args[1]);
return;
}
}
}



