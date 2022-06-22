
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Marca"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.MarcaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Marcass</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRES</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    MarcaDAO mdao=new MarcaDAO();
                    List<Marca>list=mdao.listar();
                    Iterator<Marca>iter=list.iterator();
                    Marca m=null;
                    while(iter.hasNext()){
                        m=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= m.getMarca_id()%></td>
                        <td><%= m.getMarca_nombre()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= m.getMarca_id()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= m.getMarca_id()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
