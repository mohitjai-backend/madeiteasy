function add(a,b,c,d) {

console.log(a);
console.log(b);

if(a==undefined) a=0;
if(b==undefined) b=0;
if(c==undefined) c=0;
if(d==undefined) d=0;

z = a+b+c+d;
console.log("Total is "+z);
}

add();
add(10);
add(10,20);
add(10,20,30);
add(10,20,30,40);

// undefined so output is NaN
