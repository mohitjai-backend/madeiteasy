using System;
class RulesOfAssignment {
public static void Main() {
int x,y;
y=560;
if(y==560) {
x=10;
}
Console.WriteLine(x); //  Use of unassigned local variable 'x'
}
}

// will not compile
// If variable is not assigned something on all logical paths between local value declare and local value access, code will not compile.
// compiler doesn't evaluate expressions to determine the correctness of the code.