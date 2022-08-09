class psp {
public static void Main(string [] args) {
int x = System.Int32.Parse(args[0]);
int y = System.Int32.Parse(args[1]);

System.Console.WriteLine("sum is: "+ (x+y));

}
}

/*

main ko call krne ka code kisi try block se hai.
try
{
...
call main() --> Int32 raised exception, control will go to end of try block then to catch block then to OS
and application gets terminated. 

} catch() {


}


*/




