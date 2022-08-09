function add(x,y,z) {
console.log(arguments);
return x+y+z;
}

console.log(add(10,20,30));

/*
[Arguments] { '0': 10, '1': 20, '2': 30 }
60
*/

