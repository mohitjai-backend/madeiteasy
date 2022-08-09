using System;

class psp {
public static void Main() {
int x;
for(x=1;x<=5;x++) Console.WriteLine(x);
Console.WriteLine("-".PadLeft(50,'-'));

int []y = {10,20,30,40,50};
foreach(int m in y) {
Console.WriteLine(m);
}
}
}