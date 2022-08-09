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
public override void PrintName() {
System.Console.WriteLine("ccc sam");
}
} 

class ddd : ccc {
public new void PrintName() { // not override
System.Console.WriteLine("ddd sam");
}
} 

class psp {
public static void Main() {
aaa a = new ddd();
a.PrintName(); 
 
}
}

// ddd will not run its own method because not override but aaa will also not run, it looks up in heirarchy and ddd immediate parent is ccc so will run ccc's
// printName method, and "ccc sam" will get printed. If in ccc class as well we don't override then bbb's printName will get called.
