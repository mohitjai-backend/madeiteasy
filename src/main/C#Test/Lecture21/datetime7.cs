using System;
using System.Globalization;
class psp {
public static void Main() {
string s = "04/2022/08";
DateTime d;
DateTime.TryParseExact(s,"dd/MM/yyyy",CultureInfo.InvariantCulture,DateTimeStyles.None,out d);
Console.WriteLine("{0}/{1}/{2}",d.Day,d.Month,d.Year);
}
}

/*
1/1/1 = default
*/

