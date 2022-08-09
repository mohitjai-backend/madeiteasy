using System;
using System.Globalization;
class psp {
public static void Main() {
string s = "04/2022/08";
DateTime d = DateTime.ParseExact(s,"dd/MM/yyyy",CultureInfo.InvariantCulture);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);
}
}

/*
String was not recognized as a valid DateTime.
*/

