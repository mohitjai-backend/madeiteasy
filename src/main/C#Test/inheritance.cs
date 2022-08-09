class Rectangle {
	private int length;
	private int breadth;

	public void SetLength(int x) {
		this.length = x;
	}

	public void SetBreadth(int y) {
		this.breadth = y;
	}

	public int GetLength() {
		return length;
	}

	public int GetBreadth() {
		return breadth;
	}
}

class Box : Rectangle {
	private int height;

	public int GetHeight() {
		return height;
	}

	public void SetHeight(int x) {
		this.height = x;
	}
}

class psp {

public static void Main() {
Box b;
b = new Box();
b.SetHeight(10);
b.SetLength(20);
b.SetBreadth(30);

System.Console.WriteLine(b.GetLength());
System.Console.WriteLine(b.GetBreadth());
System.Console.WriteLine(b.GetHeight());
}
}

// example of inheritance
// Multiple inheritance not supported in C#.