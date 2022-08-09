function printReport(x,y) {
console.log("some report related data",x,y);
}

function addHeader(func,sh) {
console.log("add header got called ",sh);
function proxy (p,q) {
console.log(sh);
func(p,q);
}

return proxy;
}

kkk=addHeader(printReport,"ujjain population report");
jjj=addHeader(printReport,"Indore population report");
kkk(10,20);
jjj(30,40);


//closure1_2 => which objects are live and which objects are dead after addHeader method is executed.
// aise functions jo inner hai and outer functions ke variables ka use krte hai unhe closure kehte hai.

/*
ek aisa function jiski responsibility hai ek report print krna ab hum aisa chahte the ki kuch custom heading aaye
like indore and ujjain.

This is called as decorator pattern.
*/