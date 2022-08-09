class Bulb {
private int w;

public void SetWattage(int x) {
	w=x;
}

public int GetWattage() {
	return w;
}
}

class eg2 {
public static void Main(string []args) {
Bulb b;
b = new Bulb();
b.SetWattage(60);
System.Console.WriteLine(b.GetWattage());
}
}

// 1- Array -> "String []args", [] should be before variable name

/*
primitive data types -

decimal, double, float
ulong, long, uint, int, short, ushort, byte, sbyte
char
bool
*/


/*
Cartoon K; => complex data type
*/

/*
b.SetWattage(60) -> b jisko point kr rha hai uske liye SetWattage chala.
*/