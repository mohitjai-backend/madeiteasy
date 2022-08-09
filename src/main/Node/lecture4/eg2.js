function Toy() {
this.price=1000;
} 

function add(x,y) {
return x+y;
}

var t1 = new Toy();
console.log(t1.price);
console.log(add(10,20));

var t2 = new Toy();
console.log(t2.price);

t2.price=200;
console.log(t2.price);

var t3=t2;
t3.price=20000;
console.log(t2.price);
console.log(t3.price);

console.log(t2);

/*
1000
30
1000
200
20000
20000
Toy { price: 20000 }

this points to the object for which it is called.

t3 is a pointer and t3,t2 both points to same object.
*/