using System;
class Computer {
public void Add(int p, int q, string g="Great", int r=1000) {
Console.WriteLine(p);
Console.WriteLine(q);
Console.WriteLine(g);
Console.WriteLine(r);
}
}

class psp {
public static void Main() {
Computer c = new Computer();
c.Add(10,20,"Thinking Machines");
c.Add(1,2,"cool",20);
}
}