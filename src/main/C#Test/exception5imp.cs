using System;

class psp {
public static void Main(string [] args) {

int x;
int y;

try {
	x = System.Int32.Parse(args[0]);
	try {
		y = System.Int32.Parse(args[1]);
		int z = x/y;
		System.Console.WriteLine(z);
	} catch(DivideByZeroException) {
		Console.WriteLine("can not divide by zero");
	}

	Console.WriteLine("Great");
}
catch(IndexOutOfRangeException) {
Console.WriteLine("Two arguments must have been passed");
}

Console.WriteLine("The end");
}
}

/*
Run like below - (last testcase imp)

exception5imp 10 2
o/p=>
5
Great
The end

exception5imp 10 0
o/p=>
can not divide by zero
Great // Exception being handles in inner try and regular flow will happen 
The end

exception5imp
o/p=>
Two arguments must have been passed // exception in outer try only and it will go to the end of outer try
The end

exception5imp 10
o/p=>
Two arguments must have been passed // exception in inner try and flow will go to end of inner try first but there is no suitable catch block,
so flow will go directly to the end of outer try and "Great" will not be printed.
The end
*/



