using System;
class Computer {
public void Add(int p, int q, int r=0) {
Console.WriteLine(p);
Console.WriteLine(q);
Console.WriteLine(r);
}
}

class psp {
public static void Main() {
Computer c = new Computer();
c.Add(100,2);
c.Add(100,2,10);
}
}