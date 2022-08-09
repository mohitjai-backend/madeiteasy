using System;
class Student {
private string _gender;
public string Gender {
set{
this._gender=value.ToUpper();
}
get{
return this._gender;
}
}
}

class psp {
public static void Main() {
Student s = new Student();
s.Gender="male";
Console.WriteLine(s.Gender);
}
}