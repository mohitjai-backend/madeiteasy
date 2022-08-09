var x;
x="20";

var y;
y=10;

var z;
z=x+y;

console.log(z);

z=x*y;
console.log(z);

z=x/y;
console.log(z);

z=x-y;
console.log(z);

var a = 10;
var b = 23;

console.log(b%a);

var c = "1020";
c++;
console.log(c);


var d="10";
var e = 3;

var f=d-e;

if(f==7) {
console.log("true scenario");
} else {
console.log("false scenario");
}

if(f===7) { // f is of number type.
console.log("true scenario f");
} else {
console.log("false scenario f");
}

var g = Number(d)-e;
if(g===7) {
console.log("true scenario g");
} else {
console.log("false scenario g");
}

var h = Number(d)+e;
console.log(h);

var i = "Bombay"
var j = 3;
var k = i*j;
console.log(k); // NaN

// All arithmetic operations will be performed except + operator.


