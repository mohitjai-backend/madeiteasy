class aaa {
readonly private static int x = 10; // this is fine

public void Sam() {
// x=10; this is incorrect, readonly properties can only be assigned in a constructor or at declaration time
System.Console.WriteLine(x);
}
}

class psp {
public static void Main() {
aaa a = new aaa();
a.Sam();
}
}

