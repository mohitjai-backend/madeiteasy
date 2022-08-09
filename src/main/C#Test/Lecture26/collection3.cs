using System;
using System.Collections;
class psp {
public static void Main() {
ArrayList<string> al = new ArrayList<string>();
al.Add("Good");

foreach(var k in al) Console.WriteLine(k);
}
}

// collection3.cs(5,1): error CS0308: The non-generic type 'ArrayList' cannot be used with type arguments.
// ArrayList is non-generic type.