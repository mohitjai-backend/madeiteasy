using System;
using System.Collections;
class psp {
public static void Main() {
ArrayList al = new ArrayList();
al.Add("Good");

foreach(var k in al) Console.WriteLine(k);
}
}

/*
Add
AddRange(new char[] {'A','B','C'})
Contains
a.Count => property
IndexOf
LastIndexOf
Reverse()
Reverse(index,howmany)
Insert(index,value)
InsertRange(index,new int[] {100,200})
Remove()
RemoveRange(index,howmany)
*/