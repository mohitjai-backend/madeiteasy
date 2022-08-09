using System;
class StaticMethodExample {
	public void Sam() {
		Console.WriteLine("Great");
	}

	public static void Tom() {
		Console.WriteLine("Great");
	}
}

class aaa {
public static void Main() {
	StaticMethodExample.Tom();
	//StaticMethodExample.Sam(); // An object reference is required for the non-static field, method, or property
	StaticMethodExample obj = new StaticMethodExample();
	obj.Sam();
	// obj.Tom(); //  Member 'StaticMethodExample.Tom()' cannot be accessed with an instance reference
}
}

// In C#, you need to access static variable/method only through class Name, not possible to access it through reference variable.
// Static member can not access non-static member. (From static methods, non-static method can't be called)

/* concept:-
 One copy of static property is shared by all the objects.
(example - Do it yourself)
*/

/*
local variable -> inside the function
object variable -> variables which are inside object (non-static)
class variable -> outside function within class and static

local variable - innside function
object variable - outside function non-static
class variable - outside function static
*/