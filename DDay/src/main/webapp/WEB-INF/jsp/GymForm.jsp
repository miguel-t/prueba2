<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>HOLA FORMULARIOS</title>
<style type="text/css" media="screen">
      /*la directiva include copia el contenido de un archivo y lo incrusta en la pagina*/

</style>
</head>
<body>
 
<form action="/Fierros/createGym" method="post">
    Nombre Gym:
    <input type="text" name=${nombre}>
    <br/>
 
    <p><input type="submit" value="Crear"></p>
</form>
 
</body>
</html>