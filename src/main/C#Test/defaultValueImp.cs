class aaa {
	public void Tom (int a) {
		System.Console.WriteLine(a);
	}

	public void Tom (char a) {
		System.Console.WriteLine(a);
	}

	public void Tom (bool a) {
		System.Console.WriteLine(a);
	}
}

namespace TM {
class bbb {
	public static int x = 10;
	public static aaa a = new aaa();
	
	public static void Tom (int b) {
		a.Tom(b);
	}

	public static void Tom (char b) {
		a.Tom(b);
	}

	public static void Tom (bool b) {
		a.Tom(b);
	}
}

class psp {
public static void Main() {
	System.Console.WriteLine(TM.bbb.x);
	TM.bbb.a.Tom(20);
	TM.bbb.a.Tom('A');
	TM.bbb.a.Tom(true);

	TM.bbb.Tom(50);
	TM.bbb.Tom('B');
	TM.bbb.Tom(false);

	System.Console.Out.WriteLine("Great");
	System.Console.WriteLine("Example");
	

}
}
}