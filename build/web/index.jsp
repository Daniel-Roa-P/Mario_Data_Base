<%-- 
    Document   : index
    Created on : 6/10/2018, 10:51:24 PM
    Author     : danbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="EstiloIndex.css"/>
        <script type="text/javascript" src="PasoCadenas.js" language='JavaScript1.2'></script>
        <title>Super Mario</title>
    </head>
    
    <body>
        <form id="frmTest" name="frmTest" action="PersonajeServlet" method="get">
        <img src="imagenes\marioU.jpg"/>
        <table border="3">
            <tr>
                <td colspan="3">
                    <h1>Crea tu personaje</h1>
                </td>
            </tr>
            
            <tr>
                <td>
                    <h1>Protagonista: </h1>
                </td>
                
                <td>
                    <select tabindex="4" id="Tipo_c" name="Tipo_c" onclick="mostrar1()"/>
                        <option value=""/>Seleccione una opcion
               		<option value="Mario"/>Mario
            		<option value="Luigi"/>Luigi
                        <option value="Toad"/>Toad
                </td>
                
                <td>
                    <img id="img1" src="imagenes\vacio.png"/>
                </td>
            </tr>
            
            <tr>
                <td>
                    <h1>Power up: </h1>
                </td>
                
                <td>
                    <select tabindex="5" id="Tipo_p" name="Tipo_p" onclick="mostrar2()"/>
               		<option value="N"/>Ninguno
            		<option value="FF"/>Flor de fuego
                        <option value="FH"/>Flor de hielo
                        <option value="B"/>Bellota
                        <option value="C"/>Campana
                </td>
                
                <td>
                    <img id="img2" src="imagenes\vacio.png"/>
                </td>
            </tr>
            
            <tr>
                <td>
                    <h1>Yoshi: </h1>
                </td>
                
                <td>
                    <select tabindex="5" id="Tipo_m" name="Tipo_m" onclick="mostrar3()"/>
                        <option value="N"/>Ninguno
               		<option value="YV"/>Verde
            		<option value="YAZ"/>Azul
                        <option value="YR"/>Rosa
                        <option value="YA"/>Amarillo
                </td>
                
                <td>
                    <img id="img3" src="imagenes\vacio.png"/>
                </td>
            </tr>
            
            <tr>

                <td colspan="3">
                    <input type="submit" value="Crear" onclick="validar()">
		</td>
                
            </tr>
            
            </form>
            
            <form id="frmTest" name="frmTest" action="ConexionServlet" method="get">
        
            <tr>
                
                <center>
                
                <input type="submit" value="ver personajes creados">
                
                </center>
            
            </form>
            
        </table>
        
    </body>
</html>
