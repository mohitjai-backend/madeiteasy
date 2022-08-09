using System;

class aaa:Exception {

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

// code compiled successfully but when run without passing any argument -

/*
aaa: Exception of type 'aaa' was thrown.
  at psp.Main (System.String[] args)
*/

// If passed two argument the run successfully and "The end" got printed.



