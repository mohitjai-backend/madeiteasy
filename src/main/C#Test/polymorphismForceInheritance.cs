// Following code is written by one developer

abstract class car {
abstract public void manual();
}

class ServiceStation {
public void DoService(car c) {
c.manual();
}
} // this code will be provided as a library

// Following code will be written by another developer (Mohit)

class MarutiAlto {

}

class psp {
public static void Main() {
MarutiAlto m = new MarutiAlto();
ServiceStation ss = new ServiceStation();
ss.DoService(m);
}
}

// compatibility nahi ho paa rhi because receiving end pe car ka pointer hai so now Mohit will have to inherit car class.