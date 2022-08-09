var x=20; // global declaration
function sam() {
var x=10; // local declaration (funcion level)
var y=30;

if(y==30) {
let x=40; // block level, as of now if block
console.log(x); //40
}
console.log(x); //10
}

sam();
console.log(x);//20 global x

/*
imp example
*/