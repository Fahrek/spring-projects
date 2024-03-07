<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Registro de factura</title>
    </head>
    <body>
        <h3>Bienvenido, introduce los datos de la factura</h3>
        <form:form modelAttribute="invoice" action="/spring-mvc-basics/invoice" method="POST">
            <table>
                <tr>
                    <td>Nº Factura</td>
                    <td><form:input path="invoiceNumber"/></td>
                </tr>
                <tr>
                    <td>Nombre cliente</td>
                    <td><form:input path="customerName"/></td>
                </tr>
                <tr>
                    <td>Concepto</td>
                    <td><form:input path="concept"/></td>
                </tr>
                <tr>
                    <td>Monto</td>
                    <td><form:input path="amount"/></td>
                </tr>
                <tr>
                    <td>Retenciones</td>
                    <td><form:input path="retentionPercentage"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>