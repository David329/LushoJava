<%-- 
    Document   : addEdit
    Created on : 24/09/2016, 08:05:07 PM
    Author     : antiel
--%>

<%@page import="com.academia.entidades.Admin"%>
<%@page import="com.academia.entidades.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    
        <title>Alumno</title>
    </head>
    <body>
         <%            
        Admin ad = new Admin();        
        if(request.getSession().getAttribute("userAdmin") == null)    
        {          
            request.getRequestDispatcher("/ServletErrorLog").forward(request, response);
        }        
        %>
        <% Alumno alumno = (Alumno) request.getAttribute("alumno");%>        
        
        <form class="form-horizontal"  action="ServletAddEditAlumno?editar=<%=alumno == null ? "0" : "1"%>" method="POST" id="miForm" name="miForm" onsubmit="return validar();">
            <table>
                <tbody>
                    
                    <tr>
                        <td><label class="col-sm-2 control-label">AlumnoID</label></td>
                        <td><input class="form-control" value="<%=alumno == null ? "" : alumno.getAlumnoId()%>" <%=alumno == null ? "readonly" : "readonly" %> id="alumno_id" type="text" name="alumno_id"></td>
                    </tr>
                    <tr>                        
                        <td><label class="col-sm-2 control-label">Nombre</label></td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getNombre()%>" id="nombre" type="text" name="nombre" ></td>
                    </tr>
                    <tr>
                        <td><label class="col-sm-2 control-label">Apellido Paterno </label></td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getApellidoPater()%>" id="apellidoPater" type="text" name="apellidoPater" ></td>
                    </tr>
                    <tr>
                        <td><label class="col-sm-2 control-label">Apellido Materno</label></td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getApellidoMater()%>" id="apellidoMater" type="text" name="apellidoMater" ></td>
                    </tr>
                    <tr>
                        <td><label class="col-sm-2 control-label">DNI</label></td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getDni()%>" id="dni" type="text" name="dni"></td>
                    </tr>
                    <tr>
                        <td><label class="col-sm-2 control-label">Fecha de Nacimiento</label></td>
                        <td><input required class="form-control" class="form-control" value="<%=alumno == null ? "" : alumno.getFechaN()%>" id="fechaN" type="text" name="fechaN" ></td>
                    </tr>
                    <tr>
                        <td><label class="col-sm-2 control-label">Celular</label></td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getCelular()%>" id="celular" type="text" name="celular" ></td>
                    </tr>                    
                    <tr>
                        <td><label class="col-sm-2 control-label">Telefono fijo</td>
                        <td><input required class="form-control" value="<%=alumno == null ? "" : alumno.getnCasa()%>" id="nCasa" type="text" name="nCasa" ></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input  class="btn btn-default" type="submit" value="Registrar"></td><!--id="idRegistrar" name="idRegistrar"-->                        
                    </tr>
                </tbody>
            </table>                     
        </form>
                    
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>    
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validar.js"></script>
    </body>
</html>
