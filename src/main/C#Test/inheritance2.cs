using System;
interface car {
void manual(); 
}

interface electricVehicle {
void startCharging();
}

class Neon : car,electricVehicle {

public void startCharging() {
Console.WriteLine("neon start charging");
}

public void manual() {
Console.WriteLine("neon manual");
}

}

class psp {
public static void Main(string [] args) {
Neon n = new Neon();
n.manual();
n.startCharging();
}
}




