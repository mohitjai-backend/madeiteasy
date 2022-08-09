using System;

class aaa {

}

class psp {
public static void Main(string [] args) {

if(args.Length != 2) {
aaa a;
a = new aaa();
throw a; // We are raising exception of type aaa.
}
Console.WriteLine("The end");
}
}

// compile error - cannot implicitly convert type 'aaa' to 'System.Exception'.



