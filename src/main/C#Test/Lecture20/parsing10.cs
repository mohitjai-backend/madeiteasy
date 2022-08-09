using System;
class aaa {
public void sam(out int e) {

}
}

class psp {
public static void Main(string [] args) {
aaa a = new aaa();
int x;
a.sam(out x);
Console.WriteLine(x);
}
}

/*
main.cs(3,25): error CS0177: The out parameter `e' must be assigned to before control leaves the current method
*/








