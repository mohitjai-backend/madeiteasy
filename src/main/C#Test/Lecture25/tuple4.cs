using System;

class psp {
public static void Main() {
var k1 = (10,'A',"hello");
Console.WriteLine("k1: "+k1);

var k2= (20,'B');
Console.WriteLine("k2: "+k2);

k2=k1;
//k2=(int,char)k1;//wrong not allowed
}
}

// Type conversion not possible if tuple contains different types.
// error CS0029: Cannot implicitly convert type '(int, char, string)' to '(int, char)'


// Agar tuple ke content ka type alag alag hai then those 2 tuple are not compatible to each other.
// tuple and struct me inheritance not possible 