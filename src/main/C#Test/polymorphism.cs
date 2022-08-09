class PolymorphismTest {

public int Add (int a, int b) {
	return a+b;
}

public int Add (int a, int b, int c) {
	return a+b+c;
}

public static void Main() {
PolymorphismTest obj = new PolymorphismTest();
System.Console.WriteLine(obj.Add(10,15));
System.Console.WriteLine(obj.Add(10,15,20));
}
}

// example of function overloading
// example of polymorphism