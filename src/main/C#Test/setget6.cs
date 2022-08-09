using System;
class StringCollection {
private string [] collection;

public StringCollection() {
this.collection = new string[10];
}

public string this [int index] {
set {
if(index<0 || index>=10) throw new IndexOutOfRangeException("invalid index: "+index);
this.collection[index]=value;
}

get {
if(index<0 || index>=10) throw new IndexOutOfRangeException("invalid index: "+index);
return this.collection[index];
}
}

public int Size {
get {
return this.collection.Length;
}
}

}

class psp {
public static void Main() {
StringCollection sc = new StringCollection();
sc[0] = "Amit";
sc[1] = "Mohit";
sc[2] = "Rohit";
sc[3] = "Ankita";
sc[4] = "Neha";

for(int i=0;i<sc.Size;i++) {
Console.WriteLine(sc[i]);
}

//sc[100] = "Gopal";
Console.WriteLine("The end");
}
}

// In dotnet, garbage collection is automatic. Garbage collection is for releasing memory.
// Framework beech beech me aise objects identify krta hai jinko koi pointer point nahi kr rha hai and unki memory release kr deta hai.


