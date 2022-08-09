using System;
interface a {
public readonly int x=5; // public static int x=5; => this is also not possible
void sam();
}

class psp {
public static void Main(string [] args) {

}
}

/*
error CS0525: Interfaces cannot contain fields
*/



