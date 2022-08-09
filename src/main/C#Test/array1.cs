class psp {
public static void Main() {
int [] x;
x = new int[5];
x[0]=10;
x[1]=20;
x[2]=30;
System.Console.WriteLine("Great");
x[3]=40;
x[4]=50;
//x[5]=60; // exception will occur at runtime. --> Unhandled Exception: System.IndexOutOfRangeException: Index was outside the bounds of the array.

int i;

for(i=0;i<x.Length;i++) {
System.Console.WriteLine(x[i]);
}
}
}

/*
In C#, Array is an object

int [] x; 

x is a pointer which is pointing to an object which of unknown class.
x = new int[5];

inside that object of unknown class, some array kind of data structure will be created and a "Length" property will be there inside that object which will be
a readonly property, it can't be changed.

x[0] = 60, some method gets called. (0,60) is being passed to that method, which will check if 0 is in boundary (0,Length-1), if it is not in boundary then
it will raise exception.

C# is a safe programming language.

*/


