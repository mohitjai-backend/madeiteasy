using System;

class computer {
public (int,int,int,float) compute(int p,int q) {
return (p+q,p-q,p*q,p/q);
}
}

class psp {
public static void Main() {
computer c = new computer();
var result = c.compute(10,2);
Console.WriteLine(result);
}
}




