var x=20;
function sam() {
var x=10; // local x
var y=30;

if(y==30) {
var x=40; // same local x which has been declared at the start of the function. 
console.log(x); //40
}
console.log(x); //40
}

sam();
console.log(x);//20 global x

/*
imp example
*/