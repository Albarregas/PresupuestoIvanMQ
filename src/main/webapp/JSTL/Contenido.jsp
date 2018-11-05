<%-- 
    Document   : Contenido
    Created on : 05-nov-2018, 13:33:19
    Author     : ivan9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TRUST SEGUR</title>
    </head>
    <body>
        <h1>Rellene la poliza del contenido de su edificio</h1>
        <form action="Contenido" method="post">
            <label for="cubrir">Cubrir daños: </label> 
            <input type="checkbox" name="cubrir" id="cubrir"></br>
            <label for="cantidad">Cantidad que requiere asegurar: </label> 
            <select name="cantidad">
                <option value="10.000" selected>10.000</option> 
                <option value="20.000">20.000</option> 
                <option value="30.000">30.000</option>
                <option value="50.000">50.000</option> 
                <option value="100.000">100.000</option> 
            </select></br>
            <label for="franquicia">Franquicia: </label> 
            <input type="radio" name="franquicia" value="0" checked> Ninguna<br>
            <input type="radio" name="franquicia" value="500"> 500<br>
            <input type="radio" name="franquicia" value="1.000"> 1.000<br>
            <input type="submit" name="enviar" value="Enviar">
        </form>
    </body>
</html>
