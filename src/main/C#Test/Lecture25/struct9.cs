using System;
struct Rectangle {
public int Length;
public int Breadth;
public Rectangle(int l, int b) {
this.Length=l;
this.Breadth=b;
}

public int GetLength() {
return this.Length;
}
}

class psp {
public static void Main() {
Rectangle r1 = new Rectangle();
Console.WriteLine(r1.Length);
Console.WriteLine(r1.Breadth);
Console.WriteLine("------------");

r1.Length=10;
r1.Breadth=2;
Console.WriteLine(r1.Length);
Console.WriteLine("Length method: "+r1.GetLength());
Console.WriteLine(r1.Breadth);
Console.WriteLine("------------");

Rectangle r2 = new Rectangle();
r2=r1;
Console.WriteLine(r2.Length);
Console.WriteLine(r2.Breadth);
Console.WriteLine("------------");

r2.Length=200;
r2.Breadth=25;
Console.WriteLine(r1.Length);
Console.WriteLine(r1.Breadth);
Console.WriteLine("------------");

Console.WriteLine(r2.Length);
Console.WriteLine(r2.Breadth);
Console.WriteLine("------------");

Rectangle r3 = new Rectangle(35,45);
Console.WriteLine(r3.Length);
Console.WriteLine(r3.Breadth);
Console.WriteLine("------------");
}
}

// new se sirf constrcutor call kr rhe hai,, koi address nahi assign hoga,, memory management bilkul struct ka hi rhega.
// function can also be there in struct.