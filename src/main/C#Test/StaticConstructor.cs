class aaa {
public aaa () {
System.Console.WriteLine("default constructor");
}

static aaa() {
System.Console.WriteLine("static constructor");
}
}

class psp {
public static void Main() {
aaa a;
System.Console.WriteLine("great");
aaa obj1 = new aaa(); 
aaa obj2 = new aaa();
a = new aaa();
}
}

// when class is loaded (when object is being created then static constructor gets called, it gets called only once).