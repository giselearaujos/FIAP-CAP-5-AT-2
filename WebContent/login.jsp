<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VaiComGulliver</title>
</head>
<body>
	<div>
		<form action="autentica" method="POST">
			<div>
				<label for="nome">Nome</label>
				<input 
				type="text" 
				name="nome" 
				placeholder="Insira seu nome" 
				required="required"
				/>
			</div>
			<div>
				<label for="nome">Senha</label>
				<input 
				type="password" 
				name="senha" 				
				required="required"
				/>
			</div>
			<input type="submit" value="Enviar">
			<input type="reset" value="Apagar">
		</form>
	</div>
</body>
</html>