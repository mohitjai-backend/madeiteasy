using System;

class psp {
public static void Main(string [] args) {

int x;
bool done = Int32.TryParse(args[0], out x);
Console.WriteLine(done);
Console.WriteLine(x);
}
}

// parsing13 10
//True
// 10

// parsing13 Good
//False
// 0







