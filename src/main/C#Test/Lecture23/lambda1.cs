using System;
class Computer {
public int Add(int p, int q) {
return p+q;
}

public int Subtract(int p, int q) => p-q;
}

class psp {
public static void Main() {
Computer c = new Computer();
Console.WriteLine(c.Add(100,2));
Console.WriteLine(c.Subtract(100,2));
}
}