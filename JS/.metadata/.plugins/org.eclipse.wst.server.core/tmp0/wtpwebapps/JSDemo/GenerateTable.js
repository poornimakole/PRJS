var result="";
for (var i =2; i <=10; i++) {
  for (var j = 1; j <=10; j++) {
       var a=i*j;
      result=result+a+" ";
  };
  result=result+"<br>";
}
postMessage(result);