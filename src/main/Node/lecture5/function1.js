function tom(t,p,q) {
return t(p,q);
}

console.log(tom(function sam(a,b){
return a+b;
},150,200));

//function ka address paas hoga

// function ko call krte time argument me function ko pass kr rhe hai.

