using System;
// Amit is programmer who is creating Rectangle class.
class Rectangle {
private int l;
private int b;

public Rectangle() {
this.l=1;
this.b=1;
}

public int Length {
set {
	if(value>0) this.l = value;
	else this.l=1;
}

get {
	return this.l;
}
}


public int Breadth {
set {
	if(value>0) this.b=value;
	else this.b=1;
}

get {
	return this.b;
}
}

public int Area {
get{
	return this.l*this.b;
}
}

}

class psp {
public static void Main() {
Rectangle r = new Rectangle();
r.Length=10;
r.Breadth=4;

Console.WriteLine("Length is: "+r.Length);
Console.WriteLine("Breadth is: "+r.Breadth);
Console.WriteLine("Area is: "+r.Area);

//r.Area=100; // compilation error - readonly property, value can't be assigned. set block doesn't exist.
}
}

/*
A variable named as "value" will be available of type int in set block.

set get are called as accessors.
*/



