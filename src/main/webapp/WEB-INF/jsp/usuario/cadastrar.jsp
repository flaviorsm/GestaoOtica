<%-- 
    Document   : Cadastro
    Created on : 23/03/2017, 21:42:20
    Author     : Flavio
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2>${title}</h2>
<form action="save" method="post" name="formUsuario">
    <hr />

    <div class="row" ${hiddenId}>
        <div class="form-group col-md-4">
            <label for="campo">Identificador: <c:out value="${user.idUsuario}"/></label>
            <input type="hidden" class="form-control" name="idUsuario" value="<c:out value="${user.idUsuario}"/>"/></label>            
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-8">
            <label for="campo0">Nome</label>
            <input type="text" class="form-control" name="nome" value="<c:out value="${user.nome}"/>"/>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-8">
            <label for="campo1">E-mail</label>
            <input type="email" class="form-control" name="email" value="<c:out value="${user.email}"/>"/>
        </div>    
    </div>

    <div class="row">
        <div class="form-group col-md-4">
            <label for="campo2">Senha</label>
            <input type="password" class="form-control" name="senha" value="<c:out value="${user.senha}"/>"/>
        </div>
        <div class="form-group col-md-4">
            <label for="campo3">Confirma a senha</label>
            <input type="password" class="form-control" name="senhaConfirmacao" value="<c:out value="${user.senha}"/>"/>
        </div>        
    </div>

    <div class="row">
        <div class="form-group col-md-8">      
            <label for="campo4">                    
                <input type="checkbox" name="ativo" value="S" ${checked} /> Ativo
            </label>               
        </div> 
    </div>

    <div class="row">
        <div class="form-group col-md-4">
            <label for="campo5">Ativado em</label>
            <input type="text" class="form-control" name="dtAtivacao" disabled value="<fmt:formatDate value="${user.dtAtivacao}" pattern="dd/MM/yyyy hh:mm:ss"/>"/>
        </div>  
        <div class="form-group col-md-4">
            <label for="campo6">Cadastrado em</label>
            <input type="text" class="form-control"  name="criadoEm" disabled value="<fmt:formatDate value="${user.criadoEm}" pattern="dd/MM/yyyy hh:mm:ss"/>"/>
        </div>              
    </div>
        
    <div id="actions" class="row">
        <div class="col-md-8 form-group">
            <button type="submit" class="btn btn-primary">Salvar</button>
            <a href="consultar" class="btn btn-default">Cancelar</a>
        </div>
    </div>
</form>