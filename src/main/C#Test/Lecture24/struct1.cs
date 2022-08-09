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
}
}

//warning:- struct1.cs(4,12): warning CS0649: Field 'Rectangle.Breadth' is never assigned to, and will always have its default value 0