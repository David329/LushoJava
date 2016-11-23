<%-- 
    Document   : menu
    Created on : 19/09/2016, 12:19:03 AM
    Author     : antiel
--%>

<%@page import="com.academia.entidades.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <%            
        Admin ad = new Admin();        
        if(request.getSession().getAttribute("userAdmin") == null)    
        {
            request.getRequestDispatcher("/ServletErrorLog").forward(request, response);
        }           
        %>
        <h1><%=ad.getUsuario()%></h1>
        1.<a href="ServletListarAlumnos"> Alumnos</a><BR>
        2.<a href="ServletAddAlumno">Registro de Alumno</a><BR>
        3.<a href="index.html">Salir de Sesion</a>
    </body>
</html>
