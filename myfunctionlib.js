///If a function that has access to parent variables is called as 
//closure functions
var test=(function(){
  var cnt=1;
  return function(){cnt=cnt+1; return cnt;}

})()

function f1(){
 var x=test();
 console.log("Counter : "+x);
}