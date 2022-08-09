class psp {
public static void Main(string [] args) {

int len = args.Length;
System.Console.WriteLine(len);
for(int i=0;i<len;i++)
System.Console.WriteLine(args[i]);


}
}

/*
Compile using csc string9.cs
1- 
run it string9 God is great 

o/p=> 
3
God
is  
great


2- 
run it string9 "God is great" ujjain is city of gods 

o/p=> 
6
God is great
ujjain  
is
city
of 
gods
*/



