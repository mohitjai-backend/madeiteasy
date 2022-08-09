using System;
enum GENDER {
MALE,
FEMALE
}

class Student {
private string _gender="";
public GENDER Gender {
set{
this._gender=value.ToString();
}
}

public string GetGender() {
return this._gender;
}
}

class psp {
public static void Main() {
Student s=new Student();
//s.Gender="Male";//wrong not allowed, will not compile
s.Gender=GENDER.MALE;
Console.WriteLine(s.GetGender());
}
}