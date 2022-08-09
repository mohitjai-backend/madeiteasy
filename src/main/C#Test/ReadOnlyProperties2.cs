class aaa {
private readonly int x =50; // variable initializer

public aaa() {
x=40;
}

public aaa(int p) {

}
 
public void sam() {
//x=50; code will not compile as readonly field cannot be assigned to
System.Console.WriteLine(x);
}
}

class psp {
public static void Main() {
aaa obj = new aaa();
obj.sam();

aaa obj2 = new aaa(100);
obj2.sam();
}
}

// readonly can only be initialized either through variable initializer or in constructor.
// there is no value of variable initializer if it is assigned in constructor as well so 40 will get printed.
// if parameterized constructor gets called then 50 will get printed.