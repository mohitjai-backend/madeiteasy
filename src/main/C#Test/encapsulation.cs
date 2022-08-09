class Bulb {
private int w;

public void SetWattage(int x) {
	w=x;
}

public int GetWattage() {
	return w;
}
}

class eg3 {
public static void Main(string []args) {
Bulb b;
b = new Bulb();
b.SetWattage(60);
System.Console.WriteLine("Wattage is : "+b.GetWattage());
}
}

// Example of encapsulation

