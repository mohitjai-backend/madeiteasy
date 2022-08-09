using System;
class IntCollection {
	class Node {
		private int _data;
		private Node _next;
		public Node() {
			this._next=null;
		}

		public int Data {
		set {
			this._data = value;
		}
		get {
			return this._data;
		}
		}

		public Node Next {
		set {
			this._next = value;
		}
		get {
			return this._next;
		}
		}
	} // end of class Node

	
	private Node start,end;
	private int _size;

	public IntCollection() {
		this.start=null;
		this.end=null;
		this._size=0;
	}

	public int this[int index] {
		set {
			if(index<0  || index>=this._size) {
				throw new IndexOutOfRangeException("Invalid index: "+index);
			}

			Node node = start;
			for(int x=0;x<index;x++) node = node.Next;
			node.Data = value;
		}
		get {
			if(index<0  || index>=this._size) {
				throw new IndexOutOfRangeException("Invalid index: "+index);
			}

			Node node = start;
			for(int x=0;x<index;x++) node = node.Next;
			return node.Data;
		}
	}

	public int Size { // read only
	get {
		return this._size;
	}
	}

	public void Add (int data) {
		Node node;
		node = new Node();
		node.Data = data;
		if(start == null) {
			start = end = node;
		} else {
			end.Next = node;
			end = node;
		}

		this._size++;
	}

	public void InsertAtTop(int data) {
		if(start == null) {
			this.Add(data);
			return;
		}

		Node node;
		node = new Node();
		node.Data = data;
		node.Next = start;
		start = node;
		this._size++;
	}

	public void RemoveAt(int index) {
		if(index<0 || index>=this._size) {
			throw new IndexOutOfRangeException("Invalid index: "+index);
		}

		Node p1,p2;
		p1=start;
		p2=null;
		for(int x=0;x<index;x++) {
			p2=p1;
			p1=p1.Next;
		}

		if(p1==start && p1==end) // only one node
		{
			start=end=null;
			this._size--;
			return;
		}

		if(p1==start) {
			start=start.Next;
			this._size--;
			return;
		}

		p2.Next=p1.Next;

		if(p1==end) {
			end=p2;
		}

		this._size--;
	}

	public void InsertAt(int index, int data) {
		if(index<0 || index>this._size) {
			throw new IndexOutOfRangeException("Invalid index: "+index);
		} 

		if(index==0) {
			this.InsertAtTop(data);
			return;
		}

		if(index==this._size) {
			this.Add(data);
			return;
		}

		Node node,p1,p2;
		node=new Node();
		node.Data = data;
		p1=start;
		p2=null;

		for(int x=0;x<index;x++) {
			p2=p1;
			p1=p1.Next;
		}

		node.Next=p1;
		p2.Next=node;
		this._size++;
	}
}

class psp {
public static void Main() {
IntCollection ic = new IntCollection();
ic.Add(10);
ic.Add(20);
for(int x=1;x<=15;x++) ic.Add(x*100);
for(int i=0;i<ic.Size;i++) Console.WriteLine(ic[i]);

ic[10] = 500;
Console.WriteLine("--------------------------------------");
for(int i=0;i<ic.Size;i++) Console.WriteLine(ic[i]);

//ic[201]=503; // Exception will be thrown
//Console.WriteLine(ic[200]); // Exception will be thrown

ic.InsertAtTop(105);
ic.InsertAt(13,21030);
Console.WriteLine("--------------------------------------");
for(int i=0;i<ic.Size;i++) Console.WriteLine(ic[i]);

Console.WriteLine("--------------------------------------");
ic.RemoveAt(3);
for(int i=0;i<ic.Size;i++) Console.WriteLine(ic[i]);
}
}




