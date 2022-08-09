using System;
class IntCollection {
private int [] collection;

public IntCollection() {

}

public int Size {
get {
return this.collection.Length;
}
}

public int this [int index] {
set {
if(index<0) throw new IndexOutOfRangeException("invalid index: "+index);

if(collection==null || collection.Length<=index) {
	if(collection == null) {
		collection = new int[index+1];
	} else {
		//logic to resize
		int [] t = new int[index+1];
		for(int i=0;i<collection.Length;i++) t[i] = collection[i];
		collection = t;
	}
	
	this.collection[index] = value;
}
}

get {
if(collection==null || index<0 ||index>=collection.Length) throw new IndexOutOfRangeException("invalid index: "+index);
return this.collection[index];
}


}
}

class psp {
public static void Main() {
IntCollection ic = new IntCollection();
ic[0] = 10;
ic[1] = 20;
ic[2] = 30;
ic[5] = 60;
ic[10] = 110;

for(int i=0;i<ic.Size;i++) {
Console.WriteLine(ic[i]);
}

Console.WriteLine(ic[100]);
}
}

/*
Problem statement:- Dynamically increase array size if setting value at an index and throw error in case of index doesn't exist.
*/
