using System;
interface aaa {
void sam();
}

class bbb : aaa {
public void tom() {
Console.WriteLine("great great");
}

public void sam() {
Console.WriteLine("sam");
}
}

class psp {
public static void Main(string [] args) {
aaa a; 
a = new bbb();
a.sam();
}
}

// ek interface ke pointer me us class ka address store ho skta hai jo uska directly ya indirectly child ho.



