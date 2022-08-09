class aaa {
public virtual void PrintName() {
System.Console.WriteLine("aaa sam");
}
}
class bbb : aaa {
public override void PrintName() {
System.Console.WriteLine("bbb sam");
}
} 

class ccc : bbb {
public sealed override void PrintName() { // now ddd can not override this because it is sealed.
System.Console.WriteLine("ccc sam");
}
} 

class ddd : ccc {
public override void PrintName() {
System.Console.WriteLine("ddd sam");
}
} 

class psp {
public static void Main() {
aaa a = new ddd();
a.PrintName(); 
 
}
}

// Child class can override base class method if -
// if base class method is virtual OR
// if base class method is override and not sealed 

// you can write sealed only with override keyword.


