class dog {
public void PrintName() {
System.Console.WriteLine("dog");
}
}
class GermanShephard : dog {
public void Tom() {}
public new void PrintName() { // if don't add new then warning - GermanShephard.PrintName()' hides inherited member 'dog.PrintName()
System.Console.WriteLine("german shephard dog");
}
} 

class psp {
public static void Main() {
GermanShephard a = new GermanShephard();
a.PrintName();

dog d = new dog();
d.PrintName();

dog d2 = new GermanShephard();
d2.PrintName(); // when poiter is of base and object of child, but base ki hi chalegi. Abhi override nahi kiya hai.
 
}
}

// This is not method override yet.