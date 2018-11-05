<%-- 
    Document   : Edificio
    Created on : 05-nov-2018, 13:10:30
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
        <h1>Rellene la poliza de edificos</h1>
        <form action="Edificio" method="post">

            <label for="tipo">Tipo de piso: </label> 
            <select name="tipo">
                <option value="Piso" selected>Piso</option> 
                <option value="Casa">Casa</option> 
                <option value="Adosado">Adosado</option>
                <option value="Duplex">Duplex</option> 
                <option value="Chalet">Chalet</option> 
            </select></br>

            <label for="habitaciones">Numero de habitaciones: </label> 
            <select name="habitaciones">
                <option value="1" selected>1</option> 
                <option value="2">2</option> 
                <option value="3">3</option>
                <option value="4">4</option> 
                <option value="5">5</option> 
                <option value="5">mas</option> 
            </select></br>
            <label for="fecha">Fecha de construcción: </label> 
            <select name="fecha">
                <option value="1" selected>Anterior a 1950</option> 
                <option value="2">Entre 1950-1990</option> 
                <option value="3">Entre 1991-2005</option>
                <option value="4">Entre 2006-2015</option> 
                <option value="5">Posterior a 2015</option> 
            </select><br>
            <label for="tipoConstr">Tipo de construcción: </label> <br>
            <input type="radio" name="tipoConstr" value="madera" checked> Madera<br>
            <input type="radio" name="tipoConstr" value="hormigon"> Hormigón<br>
            <label for="valor">Valor estimado en el mercado: </label> 
            <select name="valor">
                <option value="25000" selected>Menos de 50.000</option> 
                <option value="50.001">Entre 50.001-80.000</option> 
                <option value="80.001">Entre 80.001-100.000</option>
                <option value="100.001">Entre 100.001-150.000</option> 
                <option value="125.000">Mas de 150.000</option> 
            </select></br>
            <input type="submit" name="enviar" value="Enviar">
    </body>
</html>
