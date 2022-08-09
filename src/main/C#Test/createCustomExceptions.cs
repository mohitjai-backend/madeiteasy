using System;

class NegativeNumberException : Exception {

public NegativeNumberException (string message) : base(message)
{

}

}

class Utility {
public static int process (int e, int f) {
if(e<0 || f<0) {
throw new NegativeNumberException("Can't process negative number");
}

return (e+f);
}
}

class psp {
public static void Main(string [] args) {
int x = Int32.Parse(args[0]);
int y = Int32.Parse(args[1]);

try {
int z = Utility.process(x,y);
Console.WriteLine(z);
}
catch(NegativeNumberException n) {
Console.WriteLine(n); // this also calls ToString internally.
Console.WriteLine(n.Message);
Console.WriteLine(n.ToString());
}

finally {
Console.WriteLine("Cool");
}
Console.WriteLine("The end");
}
}

/*
Exception class me parameterized constructor hai and ek Message property hai.
So jo hum parameterized constructor me pass krte hai wo us Message property me set ho jaati hai.
Exception class me ek ToString() method bhi hai which will print stack trace of exception.

Finally block is executed always.

Only one catch block gets executed.

If exception occurs, application gets terminated if exception not handled but finally will get executed so
"cool" will get printed but "the end" will not get printed.

try-catch => correct
try only => incorrect
try finally => correct
*/




