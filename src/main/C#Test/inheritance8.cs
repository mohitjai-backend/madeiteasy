using System;
interface aaa {
void sam();
}

abstract class bbb : aaa { // this still doesn't compile, class must implement sam().
public void tom() {
Console.WriteLine("great great");
}
}

class psp {
public static void Main(string [] args) {
aaa a; 
a = new bbb();
}
}



