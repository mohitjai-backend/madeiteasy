using System;

class Bulb {

public int Wattage {
set;
get;
}

public int Price {
set;
get;
}
}

class psp {
public static void Main() {
Bulb b1=new Bulb{Wattage=200, Price=50};
Console.WriteLine(b1.Wattage);
Console.WriteLine(b1.Price);
}
}

// object initialization new syntax, provided field is public.
