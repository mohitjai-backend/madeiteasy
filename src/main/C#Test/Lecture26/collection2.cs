using System;
using System.Collections;
class psp {
public static void Main() {
ArrayList al = new ArrayList();
al.Add(10);
al.Add(10.23f);
al.Add('A');
al.Add("Good");
al.Add(true);

foreach(var k in al) Console.WriteLine(k);
}
}