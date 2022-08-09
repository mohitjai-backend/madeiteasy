class aaa {
public void Sam() {}
}
class bbb : aaa {
public void Tom() {}
} 

class psp {
public static void Main() {
aaa a = new aaa();
//a.Tom(); // error as aaa doesn't have Tom()
a.Sam();


bbb b = new bbb();
b.Tom();
b.Sam();

aaa aa = new bbb();
//aa.Tom(); // error as aaa doesn't have Tom(). Even aa stores the reference to bbb class object but it is of aaa class.
aa.Sam(); 
 
}
}