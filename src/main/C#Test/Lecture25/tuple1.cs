using System;

class psp {
public static void Main() {
(int,char,string) k = (10,'A',"hello");
Console.WriteLine(k);
Console.WriteLine(k.Item1);
Console.WriteLine(k.Item2);
Console.WriteLine(k.Item3);
//Console.WriteLine(k.Item4);//compile error
}
}