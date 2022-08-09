class aaa {}
class bbb : aaa {} 

class psp {
public static void Main() {
aaa a = new aaa();
bbb b = new bbb();

aaa aa = new bbb();
// bbb bb = new aaa(); // when inheritance, Cannot implicitly convert type 'aaa' to 'bbb'. An explicit conversion exists (are you missing a cast?)

//aaa aa = new bbb(); Cannot implicitly convert type 'bbb' to 'aaa' when no inheritance
//bbb bb = new aaa(); Cannot implicitly convert type 'aaa' to 'bbb' when no inheritance 
}
}