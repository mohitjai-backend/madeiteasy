function add(x,y,z,a,b) {
return x+y+z+a+b;
}

function sam() {
return add(...arguments);
}

console.log(sam(10,20,30,40,50));
