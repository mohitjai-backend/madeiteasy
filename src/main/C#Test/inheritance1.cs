using System;
abstract class car {
abstract public void manual(); 
}

abstract class electricVehicle {
abstract public void startCharging();
}

class Neon : car,electricVehicle {

public override void startCharging() {
Console.WriteLine("neon start charging");
}

public override void manual() {
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

/*
Compilation failed due to following error(s).main.cs(10,18): error CS1721: `Neon': Classes cannot have multiple base classes (`car' and `electricVehicle')
main.cs(6,16): (Location of the symbol related to previous error)
*/




