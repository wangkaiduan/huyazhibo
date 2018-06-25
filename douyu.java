<！DOCTYPE html>
<html lang =“en”>
<HEAD>
 <meta charset =“UTF-8”>
 <TITLE>欢迎你，请先登陆！</ TITLE>
 <script type =“text / javascript”src =“../ static / jsp / lx.js”> </ script>
 <link href =“https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css”rel =“stylesheet”>
 <link rel =“stylesheet”href =“../ static / css / lx.css”>
 
</ HEAD>
<BODY>
<div class =“box”>
 <H2>登陆</ H2>
 
 <div class =“input_box”>
  <input id =“uname”type =“text”name =“user”placeholder =“请输入用户名”>
 </ DIV>
 <div class =“input_box”>
  <input id =“upass”type =“password”name =“psw”placeholder =“请输入密码”>
 </ DIV>
 <div id =“error_box”> <br> </ div>
 <div class =“input_box”>
  <button type =“button”class =“btn btn-primary”onclick =“fnLogin（）”>登陆</ button>    
  <a href="regist.html"> <input type =“button”class =“btn btn-info”name =“regist”value =“注册”> </a>
 </ DIV>
 
 
 
</ DIV>
</ BODY>
</ HTML>
CSS代码：

？
1
2
3
4
五
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
三十
31
32
33
34
* {
 保证金：0;
 填充：0;
 font-family：微软雅黑;
 font-size：12px;
}
。框{
 width：390px;
 height：320px;
 border：solid 1px #ddd;
 背景：#FFF;
 位置：绝对;
 剩下：50％;
 顶部：42％;
 margin-left：-195px;
 margin-top：-160px;
 text-align：center;
}
.box h2 {
 font-weight：normal;
 颜色：＃666;
 font-size：16px;
 line-height：40px;
 溢出：隐藏;
 text-align：center;
 border-bottom：solid 1px #ddd;
 背景：＃f7f7f7;
}
.input_box {
 宽度：350像素;
 padding-bottom：15px;
 保证金：0汽车;
 溢出：隐藏;
}
JavaScript的代码：

？
1
2
3
4
五
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
函数fnLogin（）{
 var oUname = document.getElementById（“uname”）
 var oUpass = document.getElementById（“upass”）
 var oError = document.getElementById（“error_box”）
 var isError = true;
 if（oUname.value.length> 20 || oUname.value.length <6）{
  oError.innerHTML =“用户名请输入6-20位字符”;
  isError = false;
  返回;
 } else if（（oUname.value.charCodeAt（0）> = 48）&&（oUname.value.charCodeAt（0）<= 57））{
  oError.innerHTML =“首字符必须为字母”;
  返回;
 } else for（var i = 0; i <oUname.value.charCodeAt（i）; i ++）{
  如果（（oUname.value.charCodeAt（i）<48）||（oUname.value.charCodeAt（i）> 57）&&（oUname.value.charCodeAt（i）<97）||（oUname.value.charCodeAt ⅰ）> 122））{
   oError.innerHTML =“必须为字母跟数字组成”;
   返回;
  }
 }
 
 if（oUpass.value.length> 20 || oUpass.value.length <6）{
  oError.innerHTML =“密码请输入6-20位字符”
  isError = false;
  返回;
 }
 window.alert（ “登录成功”）
}
注册界面的html代码：

？
1
2
3
4
五
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
三十
31
<！DOCTYPE html>
<html lang =“en”>
<HEAD>
 <meta charset =“UTF-8”>
 <TITLE>欢迎你，请先登陆！</ TITLE>
 <script type =“text / javascript”src =“../ static / jsp / lx.js”> </ script>
 <link href =“https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css”rel =“stylesheet”>
</ HEAD>
<BODY>
<div id =“container”style =“width：400px”align =“center”>
 <div id =“header”style =“background-color：aquamarine”>
  <h2 align =“center”>注册</ h2>
 </ DIV>
 <div id =“content”>
  <p align =“center”>账号：
   <input id =“uname”type =“text”name =“user”placeholder =“账号首字符为字母”>
  </ p>
  <p align =“center”>密码：
   <input id =“upass”type =“password”name =“psw”placeholder =“请输入密码”>
  </ p>
  <div id =“error_box”> <br> </ div>
  点击
 
  <button onclick =“fnLogin（）”class =“btn btn-info”>注册</ button>
 </ DIV>
 <div style =“background-color：aquamarine”>
  <I>版权信息@ </ i>的
 </ DIV>
</ DIV>
</ BODY>
</ HTML>
