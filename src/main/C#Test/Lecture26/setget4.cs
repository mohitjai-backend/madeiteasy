using System;

class Bulb {

public int Wattage {
set;
get;
}

public int Price {
get;
}=500; // to set default value
}

class psp {
public static void Main() {
Bulb b1=new Bulb();
b1.Wattage=239;
Console.WriteLine(b1.Wattage);
Console.WriteLine(b1.Price);


Bulb b2=new Bulb();
b2.Wattage=-40;
Console.WriteLine(b2.Wattage);
//b2.Price=40;//wrong, will not compile => Property or indexer 'Bulb.Price' cannot be assigned to -- it is read only
Console.WriteLine(b2.Price);
}
}
