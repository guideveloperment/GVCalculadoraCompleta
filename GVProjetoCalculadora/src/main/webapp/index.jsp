<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	
	<h1>Calculadora</h1>
	<form name="Calculadora" method="post" action="PrimeiroServlets">
		valor 1: <input type="number" name="val1"> <p>
		valor 2: <input type="number" name="val2"> <p>
		<button type="reset" style="color:black; background-color: red" value="limpar">Limpar</button>
		<button  type="submit" style="color:black; background-color: pink;" name="btnSomar" >Somar</button>
		<button  type="submit" style="color:black;background-color: lime;"name="btnSubtrair" >Subtrair</button>
		<button  type="submit" style="color:black;background-color: orange;"name="btnMultiplicar" >Multiplicar</button>
		<button  type="submit" style="color:black;background-color: blue;"name="btnDividir" >Dividir</button>
		
				
	</form>

   
 	Resultado = ${requestScope.res}

</body>
</html>