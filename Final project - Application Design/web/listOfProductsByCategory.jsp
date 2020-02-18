<%-- 
    Document   : listOfProductsByCategory
    Created on : Feb 17, 2020, 10:56:23 AM
    Author     : carlos.chiquillo
--%>

<%@page import="dsu.finalproject.models.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of products</title>
    </head>
    <body>
        <h1>This is the list of products in that category</h1>
        
        <table class="dark">

                    <%
                        List<Product> listCategories = (List<Product>)request.getAttribute("listcategories");
                        for(int i=0; i<listCategories.size(); i++){
                           out.print("<tr><td><input name=\"operation\" type=\"submit\" value= \"" +listCategories.get(i).getName() + "\"/> </td></tr>");

                        }
                    %>
                </table>
    </body>
</html>
