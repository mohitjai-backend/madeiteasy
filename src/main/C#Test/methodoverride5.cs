class dog {
public virtual void PrintName() {
System.Console.WriteLine("dog");
}
}
class GermanShephard : dog {
public void Tom() {}
public override void PrintName() { // error: 'GermanShephard.PrintName()': cannot override inherited member 'dog.PrintName()' because it is not marked virtual, abstract, or override
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
d2.PrintName(); 
 
}
}

// This is an example of method overriding.
// If use new instead of override then it will not be overriding and base class method will get called even if child class object assigned to base class pointer.
