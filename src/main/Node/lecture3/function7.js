var x=60;
function sam() {
var x=10;
console.log(x); // local x
}

function tom() {
console.log(x); // global x
}

sam();
tom();