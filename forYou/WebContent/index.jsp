<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>just for you</title>
<script type="text/javascript" src="./for_you/jquery.js"></script>
<script type="text/javascript" src="./for_you/functions.js"></script>
<script type="text/javascript" src="./for_you/garden.js"></script>
<link type="text/css" rel="stylesheet" href="./for_you/default.css">
<style type="text/css">
@font-face {
	font-family: digit;
	src: url('digital-7_mono.ttf') format("truetype");
}
</style>
</head>
<body>
<div style="text-align:center;clear:both;">
<div style="display:none"><script language="javascript" type="text/javascript" src="./for_you/4473358.js"></script><a href="http://www.51.la/?4473358" target="_blank"><img alt="51.la 专业、免费、强健的访问统计" src="./for_you/icon_0.gif" style="border:none"></a>
</div><style type="text/css">.source-url{font-size:15px;text-align:center}</style>

<script src="./for_you/follow.js" type="text/javascript"></script>
</div>
<div id="mainDiv">
	<div id="content" style="width: 1110px; height: 625px; margin-top: 10px; margin-left: 119.5px;">
		<div id="code" style="margin-top: 112.5px;">
	</div>
		<div id="loveHeart">
			<canvas id="garden" width="670" height="625"></canvas>
			<div id="words" style="left: 630px;">
				<div id="messages">
					亲爱的翠翠，这是我们相爱在一起的时光。
					<div id="elapseClock"><span class="digit">889</span> days <span class="digit">02</span> hours <span class="digit">31</span> minutes <span class="digit">56</span> seconds</div>
				</div>
				<div id="loveu">
					&nbsp;&nbsp;生日快乐，爱你直到永永远远。<br>
					<div class="signature">发生</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
var offsetX = $("#loveHeart").width() / 2;
var offsetY = $("#loveHeart").height() / 2 - 55;
var together = new Date();
together.setFullYear(2013, 4, 29);
together.setHours(20);
together.setMinutes(0);
together.setSeconds(0);
together.setMilliseconds(0);

if (!document.createElement('canvas').getContext) {
	var msg = document.createElement("div");
	msg.id = "errorMsg";
	msg.innerHTML = "Your browser doesn't support HTML5!<br/>Recommend use Chrome 14+/IE 9+/Firefox 7+/Safari 4+"; 
	document.body.appendChild(msg);
	$("#code").css("display", "none")
	$("#copyright").css("position", "absolute");
	$("#copyright").css("bottom", "10px");
	document.execCommand("stop");
} else {
	setTimeout(function () {
		startHeartAnimation();
	}, 5000);

	timeElapse(together);
	setInterval(function () {
		timeElapse(together);
	}, 500);

	adjustCodePosition();
	$("#code").typewriter();
}
</script>

</body>
</html>