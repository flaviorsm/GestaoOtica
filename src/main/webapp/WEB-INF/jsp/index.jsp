<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">               
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" type="text/css">        
        <script src="<c:url value="/resources/js/jquery-3.2.0.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        
        <title>${title}</title> 
    </head>
    <body> 
        <jsp:include page="master/header.jsp"></jsp:include>
                   
        <jsp:include page="${page}.jsp"></jsp:include>
        
        <jsp:include page="master/footer.jsp"></jsp:include>
    </body>
</html>
