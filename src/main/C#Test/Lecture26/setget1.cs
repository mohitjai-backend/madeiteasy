using System;

class Bulb {
private int _wattage;
public int Wattage {
set{
if(value>=0 && value<=240)
this._wattage=value;
else
this._wattage=0;
}
get{
return this._wattage;
}
}
}

class psp {
public static void Main() {
Bulb b1=new Bulb();
b1.Wattage=239;
Console.WriteLine(b1.Wattage);
Bulb b2=new Bulb();
b2.Wattage=-40;
Console.WriteLine(b2.Wattage);
}
}
