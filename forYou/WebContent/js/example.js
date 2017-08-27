/**
 *html5 example 
 */
//javascript String
var a = "hello world";
var b = new String("fer,").lastIndexOf(",");
var c = new String("aa,ferjre,").split(",");

//javascript Date
var dateA = new Date();
dateA.setFullYear(2015,10,9);
var dateB = new Date();
if (dateA>dateB) {
	alert("Today is before 9th August 2015!");
}
else{
	alert("Today is after 9th August 2015!");
}


//javascript Array
var animal = new Array("cat","monkey","bear","snake");

var cars = new Array();
cars[0] = "volvo";
cars[1] = "BMW";
cars[2] = "santana";
//遍历数组
for ( var car  in cars) {
	alert(car);
}
//合并数组
animal.concat(cars);
for ( var a in animal) {
	alert(a);
}
//添加数组元素
animal.push("elephant");
//在第二个元素之后添加元素
animal.splice(2,0,"lion");
//删除第三个元素
animal.splice(2,1);

//将数组转换成字符串（默认是以逗号隔开）
//逗号隔开
alert(animal.join());
//以“.”隔开
alert(animal.join("."));

//文字数组排序（按首字母排序）
alert(animal.sort());
//数字数组排序(升序排列)
var numbers = new Array(12,25,10,2,3,8);
function sortNumber(a,b){
	return a-b;
}
alert(numbers.sort(sortNumber));

//javascript Boolean
//下列boolean对象的初始值皆为false
var myBoolean = new Boolean();
var myBoolean1 = new Boolean("");
var myBoolean2 = new Boolean(0);
var myBoolean3 = new Boolean(null);
var myBoolean4 = new Boolean(false);
var myBoolean5 = new Boolean(NaN);
//返回boolean对象的初始值
alert(myBoolean.valueOf());


//javascript RegExp
var patt1=new RegExp("e");
document.write(patt1.test("The best things in life are free")); //输出true
document.write(patt1.exec());//返回值为被找到的值若没有找到则为null

//javascript htmlDom

//window
alert(document.anchors.length);



//javascript 键盘监听事件
//注册键盘事件
document.onkeydown = function(e) {
    //捕捉input元素中id为‘msg’的回车事件
    var ev = (typeof event!= 'undefined') ? window.event : e;
    if(ev.keyCode == 13 && document.activeElement.id == "msg") {
        alert("获取到内容：" + document.activeElement.value);
        return false;//禁用回车事件
    }
    document.getElementById("hello");
    document.getElementById("ff").getAttribute("hello");
}

