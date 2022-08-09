using System;
class psp {
public static void Main() {
string dob;
Console.Write("Enter dob: ");
dob=Console.ReadLine();
DateTime d = DateTime.Parse(dob);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);
}
}

/*
Enter dob: 8/4/2020
4/8/2020
*/

