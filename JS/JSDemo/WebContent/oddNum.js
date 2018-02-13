self.onmessage=function(event){
	for (var i = event.data.to; i >=event.data.from; i--) {   
	    if(i%2!=0)
	    postMessage(i);
	}
}

