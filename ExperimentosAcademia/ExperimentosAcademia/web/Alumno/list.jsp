<%-- 
    Document   : list
    Created on : 24/09/2016, 07:35:33 PM
    Author     : antiel
--%>

<%@page import="java.util.List"%>
<%@page import="com.academia.entidades.Alumno"%>
<%@page import="com.academia.entidades.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos Matriculados</title>
    </head>
    <body>
        <%            
        Admin ad = new Admin();        
        if(request.getSession().getAttribute("userAdmin") == null)    
        {          
            request.getRequestDispatcher("/ServletErrorLog").forward(request, response);
        }        
        %>
        <% List<Alumno> lista = (List)request.getAttribute("listaAlumnos"); %>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido Paterno</th>
                    <th>Apellido Materno</th>
                    <th>Fecha de Nac.</th>
                    <th>DNI</th>
                    <th>Telefono</th>
                    <th>Celular</th>
                </tr>
            </thead>
            <tbody>
                <% for (Alumno al : lista) {%>
                <tr>
                    <td><a href="ServletAddAlumno?alumno_id=<%=al.getAlumnoId()%>"><%=al.getAlumnoId()%></a></td>
                    <td><%=al.getNombre() %></td>
                    <td><%=al.getApellidoPater() %></td>
                    <td><%=al.getApellidoMater() %></td>
                    <td><%=al.getDni() %></td>
                    <td><%=al.getnCasa() %></td>
                    <td><%=al.getCelular() %></td>
                    <td><a href="ServletEliminarAlumno?alumno_id=<%=al.getAlumnoId()%>">Eliminar</a></td>
                </tr>                
                <%}%>
            </tbody>
        </table>
        
        
    </body>
</html>
