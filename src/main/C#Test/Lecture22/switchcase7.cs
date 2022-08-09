using System;

class Analyzer {
public void analyze(object e) {
switch(e.GetType().Name) {
case "Int32":
Console.WriteLine("int type");
break;
case "String":
Console.WriteLine("string type");
break;
case "Single":
Console.WriteLine("float type");
break;
default:
Console.WriteLine("something else");
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
a.analyze(true);
}
}