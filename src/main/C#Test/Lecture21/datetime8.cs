using System;
using System.Globalization;
class psp {
public static void Main() {
string s = "04/12/2022";
DateTime d;
DateTime.TryParseExact(s,"d/M/yyyy",CultureInfo.InvariantCulture,DateTimeStyles.None,out d);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);
}
}

/*
4/8/2022
4/12/2022
*/

