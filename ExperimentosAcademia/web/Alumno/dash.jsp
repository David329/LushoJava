<%-- 
    Document   : dashboard
    Created on : 26/09/2016, 12:01:07 AM
    Author     : antiel
--%>

<%@page import="java.util.List"%>
<%@page import="com.academia.entidades.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>        
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DASH</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
             <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Experimento</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Cerrar sesion</a></li>
              </ul>              
            </div>
          </div>
        </nav>
        
        <div class="container-fluid">
         <div class="row">
           <div class="col-sm-3 col-md-2 sidebar">
             <ul class="nav nav-sidebar">
               <li class="active"><a href="#">Alumnos<span class="sr-only">(current)</span></a></li>
               <li><a href="#">Cursos</a></li>
               <li><a href="#">Profesores</a></li>
               <li><a href="#">Profesoras e.e</a></li>
             </ul>
           </div>
          </div>
        </div>       
      
      <% List<Alumno> lista = (List)request.getAttribute("listaAlumnos"); %>      
       <div class="container-fluid">
         <div class="row">
           <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
              <h2 class="sub-header">Alumnos Matriculados</h2>
              <a href="ServletAddAlumno">Nuevo</a>
              
               <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>Nombre </th>
                          <th>Apellido Paterno</th>
                          <th>Apellido Materno</th>
                          <th>Dni</th>
                          <th>Telefono de Casa</th>
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
                </div>
            </div>
           </div>
           
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>    
        <script src="js/bootstrap.min.js"></script>
    </body>
    
</html>
