class aaa {
private static readonly int x;

/*public aaa() {
x=40;
}
this will not compile, static readonly property can either be variable initialized or in static constructor.
*/

static aaa() {
x=40;
}
 
public static void sam() {
System.Console.WriteLine(x);
}
}

class psp {
public static void Main() {
aaa.sam();
}
}

