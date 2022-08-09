using System;
class Bulb {
private int Wattage;

public void SetWattage(int Wattage) {
if(Wattage>=0 && Wattage<=240) {
this.Wattage=Wattage;
} else {
this.Wattage=0;
}
}

public int GetWattage() {
return this.Wattage;
}

}

class psp {
public static void Main() {
Bulb b1 = new Bulb();
b1.SetWattage(-10);
Console.WriteLine(b1.GetWattage());

Bulb b2 = new Bulb();
b2.SetWattage(100);
Console.WriteLine(b2.GetWattage());
}

}




