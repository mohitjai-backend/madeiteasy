using System;
struct Rectangle {
public int Length;
public int Breadth;
}

class psp {
public static void Main() {
Rectangle r1;
r1.Length=10;
Console.WriteLine(r1.Length);
Console.WriteLine(r1.Breadth);
}
}

//error CS0170: Use of possibly unassigned field `Breadth'