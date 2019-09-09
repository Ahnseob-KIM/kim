<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<p id=result></p>
	<button>click</button>
	
	<script type="text/javascript">
	
		var arr = ['a','b','c'];
		/* 배열이지만 사실은 보이지 않는 "" 안에 들어있는 문자열로 인식된다. 
		그래서 이것을 바로 출력하고 [0] 을 찾으면 a가 아니라 [] 의 [ 가 출력된다. */
		
		$(document).ready(function(){
			$("button").on("click",function(){
				$.ajax({
					type : "post",
					url : "/test2",
					traditional : true,
					data : {
						'arr' : arr
					},
					dataType : 'text',
					success : function(result) {
						/* var arr2 = eval(result) */ /* [ 가 출력되지 않게 하기 위해서 eval 을 사용한 값을 arr2에 넣어주고 arr2의 0번째 배열을 출력하면  a가 출력된다. */
						var arr2 = JSON.parse(result);
						$("p").text(arr2[0])
					}
				});
			});
		});
	</script>
</body>
</html>