using System;
class Calculator {
public int Add(params int[] x,string s) {
int t=0;
for(int i=0;i<x.Length;i++) {
t=t+x[i];
}
return t;
}
}

class psp {
public static void Main() {
Calculator cal = new Calculator();
int [] nums = {1,2,3,4,5,6,7};
Console.WriteLine(cal.Add(nums,"cool"));
Console.WriteLine(cal.Add(10,20,30,"cool"));
Console.WriteLine(cal.Add(10,20,30,40,50,60,"cool"));
}
}

// compile error=>A params parameter must be the last parameter in a formal parameter list