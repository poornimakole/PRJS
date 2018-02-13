window.onload=hide;

function hide()
{
document.getElementById("checkoutdiv").style.display = 'none';
}

//changing images on mouseover
var prod=document.getElementsByTagName("img");
prod[1].addEventListener("mouseover",changeApple,true);
prod[2].addEventListener("mouseover",changeDell,true);
prod[3].addEventListener("mouseover",changeHp,true);


function changeApple()
{
	
		  
		  var theImages = new Array() 

		theImages[0] = 'laptops/apple/apple1.jpg'
		theImages[1] = 'laptops/apple/apple2.jpg'
		theImages[2] = 'laptops/apple/apple3.jpg'

		var p = theImages.length;
		var whichImage = Math.round(Math.random()*(p-1));
		  prod[1].setAttribute('src',theImages[whichImage]);
		  
		
}
function changeDell()
{
	
		var theImages = new Array() 

		theImages[0] = 'laptops/dell/dell1.jpg'
		theImages[1] = 'laptops/dell/dell2.jpg'
		theImages[2] = 'laptops/dell/dell3.jpg'

		var p = theImages.length;
		var whichImage = Math.round(Math.random()*(p-1));
		 prod[2].setAttribute('src',theImages[whichImage]);
		  
}
function changeHp()
{
		var theImages = new Array() 

		theImages[0] = 'laptops/hp/hp1.jpg'
		theImages[1] = 'laptops/hp/hp2.jpg'
		theImages[2] = 'laptops/hp/hp3.jpg'

		var p = theImages.length;
		var whichImage = Math.round(Math.random()*(p-1));
		 prod[3].setAttribute('src',theImages[whichImage]);	  
	
}

//adding to card

/*prod[1].addEventListener("click",addApple,true);
prod[2].addEventListener("click",addDell,true);
prod[3].addEventListener("click",addHp,true);*/

   
while(i>=1  && i<prod.length)
	{
	  pp=prod[i];
	  prod[i].addEventListener("click",add,true);
	}

function add(){
	  
	  document.getElementById("noItemMsg").style.display = 'none';
	  var par=pp.parentNode;
	  alert(par.nodeName);
		var c1=par.childNodes[3].childNodes[1].innerHTML;
		var c2=par.childNodes[5].innerHTML;
		var t=document.getElementById("cart-content");
		var ul=t.childNodes[1];
		 var li = document.createElement("li");
		 var im=document.createElement("img");
		  im.setAttribute('src','images/invalid.png');
		  li.appendChild(im);
		  li.appendChild(document.createTextNode(c1+"  "+c2));
		  var txt=document.createElement("input");
		    txt.setAttribute('type','number');
		  li.appendChild(txt);  
		  ul.appendChild(li);
		  im.addEventListener("click",function(){
			  var r=im.parentNode;
			    ul.removeChild(r);
			    if(!(ul.childNodes.length > 3))
			    	{
			    	 document.getElementById("noItemMsg").style.display = 'block';
			    	}
				  },true);  
}

/*var c=document.getElementsByClassName("product");

function addApple()
{
	document.getElementById("noItemMsg").style.display = 'none';
	var c1=c[0].childNodes[3].childNodes[1].innerHTML;
	var c2=c[0].childNodes[5].innerHTML;
	var t=document.getElementById("cart-content");
	var ul=t.childNodes[1];
	 var li = document.createElement("li");
	 var im=document.createElement("img");
	  im.setAttribute('src','images/invalid.png');
	  li.appendChild(im);
	  li.appendChild(document.createTextNode(c1+"  "+c2));
	  var txt=document.createElement("input");
	    txt.setAttribute('type','number');
	  li.appendChild(txt);  
	  ul.appendChild(li);
	  im.addEventListener("click",function(){
		  var r=im.parentNode;
		    ul.removeChild(r);
		    if(!(ul.childNodes.length > 3))
		    	{
		    	 document.getElementById("noItemMsg").style.display = 'block';
		    	}
			  },true);
	   
}

function addDell()
{
	document.getElementById("noItemMsg").style.display = 'none';
	var c1=c[1].childNodes[3].childNodes[1].innerHTML;
	var c2=c[1].childNodes[5].innerHTML;
	var t=document.getElementById("cart-content");
	var ul=t.childNodes[1];
	 var li = document.createElement("li");
	  var im=document.createElement("img");
	  im.setAttribute('src','images/invalid.png');
	  li.appendChild(im);
	  li.appendChild(document.createTextNode(c1+"  "+c2));
	  var txt=document.createElement("input");
	  txt.setAttribute('type','number');
	  li.appendChild(txt);
	  ul.appendChild(li);
	  im.addEventListener("click",function(){
		  var r=im.parentNode;
		    ul.removeChild(r);
		    if(!(ul.childNodes.length> 3))
		    	{
		    	 document.getElementById("noItemMsg").style.display = 'block';
		    	}
			  },true);
	   
}

function addHp()
{
	document.getElementById("noItemMsg").style.display = 'none';
	var c1=c[2].childNodes[3].childNodes[1].innerHTML;
	var c2=c[2].childNodes[5].innerHTML;
	var t=document.getElementById("cart-content");
	var ul=t.childNodes[1];
	 var li = document.createElement("li");
	 var im=document.createElement("img");
	  im.setAttribute('src','images/invalid.png');
	  li.appendChild(im);
	  li.appendChild(document.createTextNode(c1+"  "+c2));
	  var txt=document.createElement("input");
	  txt.setAttribute('type','number');
	  li.appendChild(txt);
	  ul.appendChild(li);
	  im.addEventListener("click",function(){
		  var r=im.parentNode;
		    ul.removeChild(r);
		    if(!(ul.childNodes.length > 3))
		    	{
		    	  document.getElementById("noItemMsg").style.display = 'block';
		    	}
			  },true);
	   
}
*/
//remove entire list
var r=document.getElementById("remove");
r.addEventListener("click",removeAll,true);


function removeAll()
{  
    var p=document.getElementsByTagName("ol");
    while (p[0].childNodes.length > 2) {
        p[0].removeChild(p[0].lastChild);
    }
    document.getElementById("noItemMsg").style.display = 'block';
}
//checkout

var ch=document.getElementById("checkout");
ch.addEventListener("click",show,true);

function show()
{
	document.getElementById("checkoutdiv").style.display = 'block';
}
//submit

var s=document.getElementById("submit");
s.addEventListener("click",senddata,true);

function senddata()
{
	     xml=new XMLHttpRequest();
		
		var name=document.getElementById("txtUserName").value;
		var pwd=document.getElementById("txtPwd").value;
		
		var url="jsp/userDetails.jsp";
		
		xml.open("POST",url,true);
		xml.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
		
		xml.onreadystatechange=handleResponse;
		
		var data="name="+name+"&&pwd="+pwd;
		xml.send(data);	
}

function handleResponse()
	{
		if(xml.readyState==4 && xml.status==200)
			{
			  var response=xml.responseText; 
			  var x=JSON.parse(response);
			  
			  alert("Delivery city :"+x.Delivery_City+"\n Payment Mode: "+x.Payment_mode);
			  document.getElementById("checkoutdiv").style.display = 'none';
			}
	}
