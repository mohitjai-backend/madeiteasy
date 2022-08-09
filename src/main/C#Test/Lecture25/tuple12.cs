using System;

class computer {
public (int,int,int,float) compute(int p,int q) {
return (p+q,p-q,p*q,p/q);
}
}

class psp {
public static void Main() {
computer c = new computer();
var (e,f,h,_) = c.compute(10,2); //(12,8,20,5)
Console.WriteLine(e);
Console.WriteLine(f);
Console.WriteLine(h);

var (o,_,q,_) = c.compute(100,2);
Console.WriteLine(o);
Console.WriteLine(q);
}
}




