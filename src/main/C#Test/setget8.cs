using System;
class DataCollection {
private int x;
public int Data {
set {
this.x=value;
}

get {
return this.x;
}
}
}

class psp {
public static void Main() {
DataCollection dc = new DataCollection();
dc.Data=10;
Console.WriteLine(dc.Data);
}
}

// Amit is creating DataHolder to store an element 
// Amit should not decide the type 
// right now this is not happening

// Bobby should be able to decide the type 
