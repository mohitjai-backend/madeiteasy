function sam() {
console.log("cool");
}

function tom(k) {
k();
}

tom(sam);



// cool

// 1000 address passed in tom method and k() will call the function which is pointed by 1000 address.
