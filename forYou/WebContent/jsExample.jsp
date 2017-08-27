<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main page</title>
<link rel="stylesheet" href="css/cssExample.css">
<script type="text/javascript" src="js/example.js" ></script>
<script type="text/javascript">
//javascript htmlDom
//window
window.onload=function(){
var c = document.getElementById("myCanvas");
document.getElementById("myCanvas").getAttribute(name)
var cxt = c.getContext("2d");
cxt.moveTo(10,10);
cxt.lineTo(150,50);
cxt.lineTo(10,50);
cxt.stroke();

//javascript[htmlDom] window
document.getElementById("button1").onclick = function(){
	window.screenX = 10;
	window.screenY = 10;
	window.open("index.jsp", "this is baidu website", "width:500px,height:400px");
}

//javascript[htmlDom] navigator
document.getElementById("button2").onclick = function(){
	alert("appName:"+navigator.appName+" userAgent:"+navigator.userAgent);
}

//javascript[htmlDom] screen
document.getElementById("button3").onclick = function(){
	alert("除windows任务栏以外的屏幕高度："+screen.availHeight+"限时屏幕的高度："+screen.height);
}
//javascript[htmlDom] history
document.getElementById("button4").onclick = function(){
	alert(history.length);
    history.back();
}

//javascript[htmlDom] location
document.getElementById("button5").onclick = function(){
    alert("hostName:"+location.hostname+" port:"+location.port);
	location.href = 'https://www.baidu.com/';
	location.reload();
}

//javascript[htmlDome] document
document.getElementById("button6").onclick = function(){
   var aArray = document.anchors;
   alert(aArray.length);
   var hrefArray = new Array();
   for ( var a in aArray) {
	   hrefArray.push(a.href);
    }
   //alert(hrefArray);
   alert(document.forms[1].id);
}

};
</script>
</head>
<body>
<canvas id="myCanvas" width="200" height="100" style="border:1px solid #c3c3c3;">   
</canvas>
<input id="button1" type="button" value="弹窗"/>
</br>
<input id="button2" type="button" value="navigator"/>
</br>
<input id="button3" type="button" value="screen"/>
</br>
<input id="button4" type="button" value="history"/>
</br>
<input id="button5" type="button" value="location"/>
<a href="heelo">hello</a>
<a href="fdd">fdd</a>
<a href="fdre">fdre</a>
</br>
<input id="button6" type="button" value="documentNode"/>
<form id="form1" action=""></form>
<form id="form2" action=""></form>
</body>
</html>