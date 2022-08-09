x=10; // global variable
function sam() {
console.log("first " +x); // local x
var x;
x=30;
console.log("second" +x); // local x
}

console.log("third" +x); // global x
sam();
console.log("fourth" +x); // global x

/*
third10
first undefined
second30
fourth10
*/
