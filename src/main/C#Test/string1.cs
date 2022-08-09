class psp {
public static void Main() {
string a; // String is wrong.
a="God is great";

System.Console.WriteLine(a);
System.Console.WriteLine(a.Length);

}
}

/*
God is great
12
*/

/*
DotNet CLR maintains some Data structure of string type objects.

string g;
g="hello"; g will be having some address 1000, "hello" object if not created then create one and assign it's address to g.

string m;
m="ujjain"; m will be having some address 2000 

string r;
r="hello"; r will be having some address 1000, "hello" object is already there so same address 1000 will be assigned to r.



*/


