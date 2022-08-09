class psp {
public static void Main() {
string a="hello";
string b="hello";

if(a.Equals(b)) // a jisko point kr rha uska content and b jisko point kr rha uska content ko compare kregi.
System.Console.WriteLine("same");
else
System.Console.WriteLine("not same");
}
}

// We should never compare strings with == sign as it will compare the addresses only.
// Always use Equals to compare strings / objects for equality.


