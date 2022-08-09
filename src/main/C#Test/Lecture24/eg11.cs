using System;
enum GENDER:short {
MALE=45000,
FEMALE=500
}

class psp {
public static void Main() {
Console.WriteLine(GENDER.MALE);
Console.WriteLine(GENDER.FEMALE);
short x = (short)GENDER.MALE;
short y = (short)GENDER.FEMALE;
Console.WriteLine(x);
Console.WriteLine(y);
}
}

// will not compile,, short two bytes max value (32767)