	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<%@ page import="edu.ifsp.loja.controllers.produto.buscar.BuscarProdutoDTO" %>
	<%@ page import="edu.ifsp.loja.controllers.produto.*" %>
	
	<%@ page import="java.util.List" %>
	
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Loja Web2</title>
	</head>
	<body>
		<%
		BuscarProdutoDTO dto = (BuscarProdutoDTO)request.getAttribute("dto");	
		%>
	
		<h1>Buscar produto</h1>
		<form method="post" action="/loja-web2/produto/buscar">
			<label for="descricao">Descrição: </label>
			<input type="text" name="descricao" id="descricao" value="<%= dto.descricao() %>">
			<br>
		
			<br>
			
			<button type="submit">Buscar</button>
		</form>
		
		<%
		if (request.getAttribute("produtos") != null) {
			List<ProdutoDTO> produtos = (List<ProdutoDTO>)request.getAttribute("produtos");
		%>
		<br>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Descricao</th>
				<th>preçol</th>
			</tr>
			
			<% for (ProdutoDTO c : produtos) { %>
			<tr>
				<td><%= c.id() %></td>
				<td><%= c.descricao() %></td>
				<td><%= c.preco() %></td>
			</tr>
			<% } %>
			
		</table>
		<%
		} else {
		%>
		<p>Nenhum produto encontrado para os critérios informados.</p>
		<%
		}
		%>
		
	</body>
	</html>