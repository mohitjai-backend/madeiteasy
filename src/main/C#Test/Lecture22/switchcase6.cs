using System;

class Analyzer {
public void analyze(object e) {
switch(e) {
case int k:
Console.WriteLine("int type: {0}",k);
break;

case string u:
Console.WriteLine("string type: {0}",u);
break;

default:
Console.WriteLine("unable to analyze");
break;
}
}
}

class psp {
public static void Main() {
Analyzer a = new Analyzer();
a.analyze(10);
a.analyze("hello");
a.analyze(10.23f);
}
}

//not compiling with latest c# version
//imp feature
/*
switchcase6.cs(6,10): error CS1525: Invalid expression term 'int'
switchcase6.cs(10,13): error CS1525: Invalid expression term 'string'
*/