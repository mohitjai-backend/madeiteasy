using System;
class Bulb {
private int w;

public int Wattage {
set {
	if(value>=0 && value<=240) {
		this.w=value;
	} else {
		this.w=0;
	}
}

get {
return this.w;
}
}

}

class psp {
public static void Main() {
Bulb b1 = new Bulb();
b1.Wattage=-10;
Console.WriteLine(b1.Wattage);

Bulb b2 = new Bulb();
b2.Wattage=100;
Console.WriteLine(b2.Wattage);
}

}




