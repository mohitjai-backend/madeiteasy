using System;
class psp {
public static void Main() {
string name;
Console.Write("Enter name: ");
name = Console.ReadLine();

int salary;
Console.Write("Enter salary: ");
Int32.TryParse(Console.ReadLine(), out salary);

Console.WriteLine("name: {0}, salary: {1}", name, salary);
}
}