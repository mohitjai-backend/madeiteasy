class psp {
public static void Main() {

string a="agra";
string b="goa";
int x = a.CompareTo(b);
System.Console.WriteLine(x);

string c="maldives";
string d="goa";
x = c.CompareTo(d);
System.Console.WriteLine(x);

string e="goa";
string f="goa";
x= e.CompareTo(f);
System.Console.WriteLine(x);


}
}

/*
-1
1
0
*/

// Agra is less than Goa, lexicographically comparison.


