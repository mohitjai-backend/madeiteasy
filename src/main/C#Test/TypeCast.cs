class aaa {
public void sam(long x) {
System.Console.WriteLine("long " + x);
}

public void sam(int x) {
System.Console.WriteLine("int " + x);
}
}

class psp {
public static void Main() {
aaa a = new aaa();
int x =20;
long y=30;
a.sam(x);
a.sam(y);
}
}

// if send int and at receiving end long then compile
// if send long and at receiving end int then will not compile --> will need to typecast in int