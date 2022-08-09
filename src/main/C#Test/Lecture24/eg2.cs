using System;
class Student {
private string _gender;
public string Gender {
set{
if(value.Equals("MALE",StringComparison.InvariantCultureIgnoreCase) || value.Equals("FEMALE",StringComparison.InvariantCultureIgnoreCase))
this._gender=value.ToUpper();
else
this._gender="";
}
get{
return this._gender;
}
}
}

class psp {
public static void Main() {
Student s = new Student();
s.Gender="mumbai";
Console.WriteLine(s.Gender);
}
}