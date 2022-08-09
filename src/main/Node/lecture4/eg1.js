function abcd() {

} 

function doSomething() {

}

var a = new abcd();
doSomething();
console.log(a);
console.log(doSomething);

/*
abcd {}
[Function: doSomething]

a is a pointer which will store address of object of type abcd
*/