using System;
enum GENDER:char { // not compiling,, char not allowed. Type byte, sbyte, short, ushort, int, uint, long or ulong expected
MALE=200,
FEMALE=500
}

class psp {
public static void Main() {
Console.WriteLine(GENDER.MALE);
Console.WriteLine(GENDER.FEMALE);
int x = (int)GENDER.MALE;
int y = (int)GENDER.FEMALE;
Console.WriteLine(x);
Console.WriteLine(y);
}
}
