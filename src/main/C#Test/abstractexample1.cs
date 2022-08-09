abstract class aaa {
abstract public void m1();
}

/*
abstract class bbb : aaa {

} 
this will compile but if not abstract then error - 'bbb' does not implement inherited abstract member 'aaa.m1()'
*/

class bbb : aaa {
public override void m1() { // 'bbb' does not implement inherited abstract member 'aaa.m1()' if not used override keyword.
System.Console.WriteLine("hello");
}
}

class psp {
public static void Main() {
bbb b = new bbb();
b.m1();
}
}

// We can create class as abstract without any abstract methods. By this, we can only stop creating object of this class.
