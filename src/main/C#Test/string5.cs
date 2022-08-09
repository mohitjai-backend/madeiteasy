class Whatever {
public static void DoSomething(object k) {
// some code
System.Console.WriteLine(k.ToString());
}

}

class aaa {}

class psp {
public static void Main() {
aaa a = new aaa();
Whatever.DoSomething(a);
}
}

// this way aaa will get printed. ToString() of object class returns the name of the class whose object calls ToString().


