using System;

class psp {
public static void Main() {
(int age, char section, string name) k1 = (10,'A',"hello");
Console.WriteLine(k1);
Console.WriteLine(k1.name);
Console.WriteLine(k1.age);
Console.WriteLine(k1.Item1);
Console.WriteLine(k1.Item2);
k1.age=20;
Console.WriteLine(k1.age);
}
}

// Another way to doing the same

