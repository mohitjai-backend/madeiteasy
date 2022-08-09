class aaa {
public string this[int i] {
set {
// here a variable named value is available whose type is string
}

get {
	return "value is: "+ (i*i);
}
}
}

class psp {
public static void Main() {
aaa a = new aaa();
a[10] = "good";

/*
The above line will only compile if aaa class has a indexer method representing a property of type string 
(because of "good") and whose parameter is of type int (because of 10) and should have a set portion 
(because of assignment operation)

indexer method is named as "this" followed by [] instead of () 
*/

System.Console.WriteLine(a[100]); //get accessor should be available.
}
}


