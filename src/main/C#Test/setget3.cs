using System;
class aaa {
public string this[int k] {
set {
Console.WriteLine("set part");
Console.WriteLine(k);
Console.WriteLine(value);
} 

get {
Console.WriteLine("get part");
Console.WriteLine(k);
return "new feature";
}
}

}

class psp {
public static void Main() {
aaa a = new aaa();
a[0] = "God is great";
a[1] = "Ujjain is the city of gods";
Console.WriteLine(a[10]);
}

}




