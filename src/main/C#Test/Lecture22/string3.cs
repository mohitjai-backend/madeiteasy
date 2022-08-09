using System;
class Calculator {
public int Add(int[] x) {
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
Console.WriteLine(cal.Add(nums));
}
}