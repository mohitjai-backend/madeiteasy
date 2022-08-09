using System;

class computer {
public (int,int,int,float) compute(int p,int q) {
return (p+q,p-q,p*q,p/q);
}
}

class psp {
public static void Main() {
computer c = new computer();
var (e,f,h) = c.compute(10,2);
Console.WriteLine(e);
Console.WriteLine(f);
Console.WriteLine(h);
}
}

//tuple11.cs(12,1): error CS8132: Cannot deconstruct a tuple of '4' elements into '3' variables.




