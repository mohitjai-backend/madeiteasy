class aaa {
public override string ToString() {
return "hello great";
}
}

class psp {
public static void Main() {
aaa a = new aaa();
System.Console.WriteLine(a);

string s;
s="Great lecture";
System.Console.WriteLine(s); // ToString() method will get called of string class now.
}
}

// WriteLine method internally calls ToString() method.


