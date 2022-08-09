using System;

class Bulb {
private int w;
public int Wattage {
set {
this.w=value;
}

get {
return this.w;
}
}
}

class DataCollection<cartoon> {
private cartoon x;
public cartoon Data {
set {
this.x=value;
}

get {
return this.x;
}
}
}

class psp {
public static void Main() {
DataCollection<int> dc1 = new DataCollection<int>();
dc1.Data=10;

DataCollection<float> dc2 = new DataCollection<float>();
dc2.Data=23.33f;

DataCollection<char> dc3 = new DataCollection<char>();
dc3.Data='A';

Console.WriteLine(dc1.Data);
Console.WriteLine(dc2.Data);
Console.WriteLine(dc3.Data);

DataCollection<Bulb> dc4 = new DataCollection<Bulb>();
Bulb b = new Bulb();
b.Wattage=100;
dc4.Data = b;
Console.WriteLine(dc4.Data.Wattage);
}
}

// cartoon can accept any type of class.


