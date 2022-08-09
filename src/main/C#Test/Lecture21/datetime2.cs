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
Enter dob 16/09/2022

Unhandled Exception:
System.FormatException: String was not recognized as a valid DateTime.
  at System.DateTimeParse.Parse (System.ReadOnlySpan`1[T] s, System.Globalization.DateTimeFormatInfo dtfi, System.Globalization.DateTimeStyles styles) [0x0002a] in <162bccb5b7ae4c18b9c0cff8fdc3dfbc>:0 
  at System.DateTime.Parse (System.String s) [0x00015] in <162bccb5b7ae4c18b9c0cff8fdc3dfbc>:0 
  at psp.Main () [0x00010] in <43f36cbb70554e62ab7c73aa71757add>:0 
*/