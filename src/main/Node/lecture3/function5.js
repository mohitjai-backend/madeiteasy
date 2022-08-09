x=10; // global variable
function sam() {
console.log("first " +x); // global x
x=30;
console.log("second" +x); // global x
}

console.log("third" +x); // global x
sam();
console.log("fourth" +x); // global x

/*
third10
first 10
second30
fourth30
*/

/*
Agar x pure function me khi bhi declare hua hai then it will be a local variable of the function. And agar local 
variable ko koi value assigned nhi to unassigned.
*/
