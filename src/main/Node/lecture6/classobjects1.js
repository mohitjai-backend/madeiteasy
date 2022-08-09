function Toy() {
this.price=0;
this.brand="";
this.manual = function() {
console.log("manual for brand ", this.brand);
}
}

var t1=new Toy();
var t2=new Toy();

t1.price=1000;
t2.price=2000;

t1.brand="x";
t2.brand="y";

console.log(t1.price+" "+t1.brand);
console.log(t2.price+" "+t2.brand);

t1.manual();
t2.manual();


// class is a blueprint 
// objects or instances
// function is called method if within a class

/*
1000 x
2000 y
manual for brand  x
manual for brand  y
*/


