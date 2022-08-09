class Bulb {
private int Wattage;
public void SetWattage(int Wattage) {
this.Wattage = Wattage;
}

public int GetWattage() {
return this.Wattage;
}

}

class psp {
public static void Main() {
Bulb [] bulbs;
bulbs = new Bulb[3]; 

bulbs[0] = new Bulb(); // this is imp otherwise Null reference exception
bulbs[1] = new Bulb();
bulbs[2] = new Bulb();

bulbs[0].SetWattage(60);
bulbs[1].SetWattage(70);
bulbs[2].SetWattage(80);

System.Console.WriteLine(bulbs[0].GetWattage());
System.Console.WriteLine(bulbs[1].GetWattage());
System.Console.WriteLine(bulbs[2].GetWattage());

}
}

/*
Always think array as an object.
*/



