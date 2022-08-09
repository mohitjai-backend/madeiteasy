using System;

class computer {
public (int,int,int,float) compute(int p,int q) {
return (p+q,p-q,p*q,p/q);
}
}

class psp {
public static void Main() {
computer c = new computer();
var (e,f,g,h) = c.compute(10,2);
Console.WriteLine(e);
Console.WriteLine(f);
Console.WriteLine(g);
Console.WriteLine(h);

var r=(10,20,'A');
var (p,q,m) = r;
Console.WriteLine(p);
Console.WriteLine(q);
Console.WriteLine(m);
}
}

//tuple decomposing




