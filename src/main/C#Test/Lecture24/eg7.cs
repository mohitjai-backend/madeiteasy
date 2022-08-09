using System;
enum GENDER {
MALE=200,
FEMALE=500
}

class psp {
public static void Main() {
Console.WriteLine(GENDER.MALE);
Console.WriteLine(GENDER.FEMALE);
//int x = GENDER.MALE; //not compiling
int x = (int)GENDER.MALE;
int y = (int)GENDER.FEMALE;
Console.WriteLine(x);
Console.WriteLine(y);
}
}