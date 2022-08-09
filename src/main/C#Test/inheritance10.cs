using System;
interface aaa {
void sam();
}

interface bbb {
void tom();
}

class ccc {
public void pom() {

}
}

class ddd : ccc,aaa,bbb {
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
a = new ddd();
a.sam();
//a.tom(); // wrong

bbb b;
b = new ddd();
b.tom();
//b.sam(); // wrong
}
}

// class ccc should come before aaa and bbb interfaces.
// Example tv, remote and tv panel. remote and tv panel will be interfaces.

// jb bhi guideline ke liye kuch banana ho to interface banaye.


