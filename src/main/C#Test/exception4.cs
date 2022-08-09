using System;

class Calculator {

public static int divide (int x, int y) {
return x/y;
}
}

class psp {
public static void Main(string [] args) {

int x = System.Int32.Parse(args[0]);
int y = System.Int32.Parse(args[1]);

try {
int z = Calculator.divide(x,y);
Console.WriteLine(z);
}
catch(DivideByZeroException) {
Console.WriteLine("can not divide by zero");
}
catch(Exception) {
Console.WriteLine("some problem");
} 
Console.WriteLine("The end");
}
}

/*
Purpose of exception handling -

To rectify the problem inside catch block if possible.


We call a function and if no try catch handled in that function and some exception occurs so control will go to
the try block of where the function is being called.


aaa() ==> bbb() ==> ccc() ==> ddd(), some exception occurs in ddd function and only aaa contains the try catch block,
so control will go to the end of try block of aaa() function.

Ek try ke sath multiple catch ho skte hai.

vvimp => If an exception occurs, control go to the end of try block, not directly to any catch block.



sam() {
s.c.w("cool");
return;
s.c.w("super cool"); // looking at the code, this code will never get executed. C# compiler gives warning for the same.
}


Imp:- If catch(Exception) {} will be written above catch(DivideByZeroException) {}, code will not compile.
=> error CS0160: A previous catch clause already catches all exceptions of this or a super type `System.Exception'

*/



