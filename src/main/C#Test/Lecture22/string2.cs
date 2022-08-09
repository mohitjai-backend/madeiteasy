using System;
class psp {
public static void Main() {
int x=10;
float y=23.3f;
string z="good";
Console.WriteLine("{0}-->{1}-->{2}",x,y,z);

string e = string.Format("{0}-->{1}-->{2}",x,y,z);
Console.WriteLine(e);

String f = $"{x}-->{y}-->{z}";
Console.WriteLine(f);
}
}