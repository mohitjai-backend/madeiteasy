function sam() {
var x=10;
console.log(x); // local x
}

function tom() {
console.log(x); // x doesn't exist, neither local nor global
}

sam();
tom(); // x is not defined error