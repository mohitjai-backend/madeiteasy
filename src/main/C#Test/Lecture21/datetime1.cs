using System;
class psp {
public static void Main() {
DateTime d = new DateTime(2022,8,4);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);

DateTime today=DateTime.Now;
Console.WriteLine("{0}/{1}/{2}",today.Day,today.Month,today.Year);
}
}