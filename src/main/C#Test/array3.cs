class psp {
public static void Main() {
int [] x;
x = new int[3];
x[0]=10;
x[1]=20;
x[2]=30;

System.Console.WriteLine("Length: "+x.Length);

int [] t;
t=new int[5];

for(int i=0;i<x.Length;i++) {
t[i] = x[i];
}

x=t;

x[3] = 100;
x[4] = 200;

System.Console.WriteLine("Length: "+x.Length);

for(int i=0;i<x.Length;i++) {
System.Console.WriteLine(x[i]);
}

}
}




