// Following code is written by one developer

abstract class car {
abstract public void manual();
}

class ServiceStation {
public void DoService(car c) {
c.manual();
}
} 

// Following code will be written by another developer (Mohit)

class MarutiAlto : car {
public override void manual() {
System.Console.WriteLine("alto manual");
}
}

class psp {
public static void Main() {
MarutiAlto m = new MarutiAlto();
ServiceStation ss = new ServiceStation();
ss.DoService(m);
}
}