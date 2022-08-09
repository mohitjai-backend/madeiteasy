using System;
class psp {
public static void Main() {
String a = "God is great";
Console.WriteLine(a.Length); // Length is property
Console.WriteLine(a.ToUpper());
Console.WriteLine(a); // string is immutable,, in above line new string will be created and returned.

a="   God is   great    ";
Console.WriteLine("({0})",a);
Console.WriteLine("({0})",a.Trim());

int x=10;
string y="cool";
float z=2.36f;
string b=string.Format("{0} --- {1} >>> {2}",x,y,z);
Console.WriteLine(b);

a="God is great";
Console.WriteLine(a.PadLeft(50,'#'));
Console.WriteLine(a.PadRight(50,'#'));

Console.WriteLine(a.Contains("God"));
Console.WriteLine(a.Contains("cool"));
Console.WriteLine(a.Replace("great","powerful"));

Console.WriteLine(a.Remove(4,4)); // From Where, how many
Console.WriteLine(a.Remove(4)); //from where, till end
Console.WriteLine(a.Insert(4,"hello"));

Console.WriteLine("Use \n for next line");
Console.WriteLine("Use \\n for next line");
Console.WriteLine(@"Use \n for next line");

string d = string.Concat("good","bad");
Console.WriteLine(d);

}
}