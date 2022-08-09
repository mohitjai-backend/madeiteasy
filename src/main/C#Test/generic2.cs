using System;

class aaa<one,two> {
public one x;
public two y;
}

class psp {
public static void Main() {
aaa<int,char> a = new aaa<int,char>();
a.x=10;
a.y='A';

Console.WriteLine(a.x);
Console.WriteLine(a.y);

aaa<char,char> a2 = new aaa<char,char>();
a2.x='B';
a2.y='C';

Console.WriteLine(a2.x);
Console.WriteLine(a2.y);
}
}

/*
x and y were public in above code so no need of get and set accessors. Alternate is the below code -

class aaa<one,two> {
private one p;
private two q;

public one x {
    set {
        this.p = value;
    }
    get {
        return this.p;
    }
}

public two y {
    set {
        this.q=value;
    }
    get {
        return this.q;
    }
}
}
*/


