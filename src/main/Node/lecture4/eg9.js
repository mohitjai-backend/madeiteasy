function add(x,y,z) {
console.log(arguments);
console.log(arguments.length);

var total=0;
for(var i=0;i<arguments.length;i++) {
total = total+arguments[i];
}
return total;
}

console.log(add(10,20,30));



