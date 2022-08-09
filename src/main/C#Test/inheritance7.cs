using System;
interface aaa {
void sam();
}

class psp {
public static void Main(string [] args) {
aaa a; // this is possible
a = new aaa(); // this is not possible, cannot create instance of abstract class and interface
}
}



