<%-- 
    Document   : consulta
    Created on : 05/04/2017, 00:13:24
    Author     : Flavio
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header>
    <div class="row">
        <div class="col-sm-6">
            <h2>${title}</h2>
        </div>
        <div class="col-sm-6 text-right h2">
            <a class="btn btn-primary" href="cadastrar">
                <i class="fa fa-plus"></i> Novo Cliente
            </a>
            <a class="btn btn-default" href="consultar">
                <i class="fa fa-refresh"></i> Atualizar
            </a>
        </div>
    </div>
</header>
<div class="table-responsive">
    <table class="table table-striped table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th width="30%">E-mail</th>
                <th>Ativo</th>
                <th>Data Ativação</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="u" items="${usuarios}">
                <tr>
                    <th><c:out value="${u.idUsuario}"></c:out></th>
                    <td><c:out value="${u.nome}"></c:out></td>
                    <td><c:out value="${u.email}"></c:out></td>
                    <td><c:out value="${u.ativo}"></c:out></td>
                    <td><c:out value="${u.dtAtivacao}"></c:out></td>
                    <td class="actions text-right">                        
                        <a href="${u.idUsuario}" class="btn btn-sm btn-warning">
                            <i class="fa fa-pencil"></i> Editar
                        </a>
                        <a href="excluir/${u.idUsuario}" class="btn btn-sm btn-danger">
                            <i class="fa fa-trash"></i> Excluir
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>



