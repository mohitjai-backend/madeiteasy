class aaa {
public aaa (int x) {
System.Console.WriteLine("Base class parameterized constructor got called");
}
}

class bbb : aaa 
{
	/* The following code is written by compiler.
	public bbb() : base() 
	{

	}
	*/

	public bbb() : base(10) 
	{
		System.Console.WriteLine("Child class parameterized constructor got called");
	}
}

class psp {
public static void Main() {
bbb obj = new bbb();
}
}

// error CS1729: 'aaa' does not contain a constructor that takes 0 arguments