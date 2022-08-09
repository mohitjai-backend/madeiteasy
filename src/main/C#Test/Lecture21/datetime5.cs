using System;
using System.Globalization;
class psp {
public static void Main() {
string s = "04/08/2022";
DateTime d = DateTime.ParseExact(s,"dd/MM/yyyy",CultureInfo.InvariantCulture);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);
}
}

/*
04/08/2022
*/

