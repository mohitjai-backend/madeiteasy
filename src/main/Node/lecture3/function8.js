function sam() {
x=10; // global x
console.log(x);
}

function tom() {
console.log(x);
}

sam();
tom();