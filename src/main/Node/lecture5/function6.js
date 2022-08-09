function add(x,y,z) {
return x+y+z;
}

function addTwo(f) {
return function(x,y) {
return add(x,y,0);
}
}

var a = addTwo(add); // a will be having address of anonymous function(x,y)
console.log(a(140,150));
