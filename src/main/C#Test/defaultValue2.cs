sealed class aaa {
}

class bbb : aaa {
}

class psp {
public static void Main() {}
}

// sealed class can't be inherited.

/*
Default value ->
All int and float -> 0
Object reference -> null (but it will not print, null doesn't get printed)
char -> null space (not exactly ASCII but int of that char is 0)
ASCII 65 - A
ASCII 32 - space ( )
ASCII 0 - null space ( )
*/

/*
int x = False;
it will not compile. Strict rules being followed.
*/