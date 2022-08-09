using System;

class psp {
public static void Main() {
var k1 = (10,'A',"hello");
Console.WriteLine("k1: "+k1);
Console.WriteLine(k1.Item1);
Console.WriteLine(k1.Item2);
Console.WriteLine(k1.Item3);

var k2= (20,'B',"Good");
Console.WriteLine("k2: "+k2);

k1=k2;
Console.WriteLine("k1: "+k1);
k1.Item1=40;
Console.WriteLine("k1: "+k1);
Console.WriteLine("k1: "+k2);

}
}

// value based, similar to struct based.