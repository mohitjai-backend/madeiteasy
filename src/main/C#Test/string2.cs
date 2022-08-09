class psp {
public static void Main() {
string a;
a="hello";

string b;
b="hello man";

string c;
c="hello";

System.Console.WriteLine(a==b);
System.Console.WriteLine(a==c);

c=null;

System.Console.WriteLine(a==c);

}
}

// Address is being compared which a and c stores, not the string comparison.


