/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar(){
    var nombre, apellidoPaterno, apellidoMaterno, fechaNac, dni, celular, telefono;
    var expresionTexto, expresionNumerica;
        
    nombre = document.getElementById("nombre").value;
    apellidoPaterno = document.getElementById("apellidoPater").value;
    apellidoMaterno = document.getElementById("apellidoMater").value;
    fechaNac = document.getElementById("fechaN").value;
    dni = document.getElementById("dni").value;
    celular = document.getElementById("celular").value;
    telefono = document.getElementById("nCasa").value;
    expresionTexto = /[A-Za-z]$/;
    expresionNumerica = /[0-9]$/;
    
    if(nombre === "" || apellidoPaterno === "" || apellidoMaterno === ""|| fechaNac === "" || dni ==="" || celular === "" || telefono ==="")
    {
        alert("Todos los campos son obligatorios");
        return false;
    }
    
    if(nombre.length<2 || nombre.length>31)
    {
        alert("Ingrese un nombre valido");
        return false;
    }
    if(!expresionTexto.test(nombre))
    {
        alert("Ingrese un nombre valido solo texto");
        return false;
    }
    
    if(apellidoPaterno.length<2 || apellidoPaterno.length>20)
    {
        alert("Ingrese un apellido paterno valido");
        return false;
    }
     if(!expresionTexto.test(apellidoPaterno))
    {
        alert("Ingrese un apellido paterno valido solo texto");
        return false;
    }
    
     if(apellidoMaterno.length<2 || apellidoMaterno.length>20)
    {
        alert("Ingrese un apellido materno valido");
        return false;
    }
     if(!expresionTexto.test(apellidoMaterno))
    {
        alert("Ingrese un apellido materno valido solo texto");
        return false;
    }
    if(dni.length<7 || dni.length >9 )
    {
        alert("Ingrese un dni valido");
        return false;
    }
    if(!expresionNumerica.test(dni))
    {
        alert("Ingrese solo numeros en el dni");
        return false;
    }
    if(celular.length<9 || celular.length>12)
    {
        alert("Ingrese un celular valido");
        return false;
    }
    if(isNaN(celular))
    {
        alert("El celular ingresado no es un numero");
        return false;
    }
    if(telefono.length != 7)
    {
        alert("Ingrese un telefono valido");
        return false;
    }
    if(isNaN(telefono))
    {
        alert("El telefono ingresado no es un numero");
        return false;
    }
    
}

function validarLogin(){
    var usuario, contraseña;
    usuario = document.getElement("usuario").value;
    contraseña = document.getElement("pass").valueOf();
    
    if(usuario === ""|| contraseña===""){
        alert("Todos los campos son requeridos");
        return false;
    }
}