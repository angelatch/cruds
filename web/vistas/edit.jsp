
<%@page import="Modelo.Marca"%>
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
            <div class="col-lg-6">
              <%
              MarcaDAO mdao=new MarcaDAO();
              int id=Integer.parseInt((String)request.getAttribute("marca_id"));
              Marca m=(Marca)mdao.list(id);
          %>
            <h1>Modificar Marca</h1>
            <form action="Controlador">
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= m.getMarca_nombre()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= m.getMarca_id()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
