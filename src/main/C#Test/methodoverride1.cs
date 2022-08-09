class aaa {
	public void Sam() {
		System.Console.WriteLine("hello");
	}

	public void Tom() {
		System.Console.WriteLine("cool");
	}
}

class bbb : aaa 
{
	public void Tom() {
		base.Tom();
		System.Console.WriteLine("super cool");
	}
}

class psp {
public static void Main() {
bbb obj = new bbb();
obj.Tom();
obj.Sam();
}
}

// Method override means, same name, signature same and return type same as well.
// new keyword base is introduced.
