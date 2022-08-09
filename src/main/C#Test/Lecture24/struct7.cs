using System;
struct Rectangle {
public int Length;
public int Breadth;
}

class psp {
public static void Main() {
Rectangle r1 = new Rectangle();
r1.Length=10;
r1.Breadth=2;
Console.WriteLine(r1.Length);
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

}
}

/*
10
2
------------
10
2
------------
10
2
------------
200
25
------------
*/

// struct is value based and class is reference based. (imp)