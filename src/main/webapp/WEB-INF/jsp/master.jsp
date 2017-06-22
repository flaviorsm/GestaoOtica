<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">               
        
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" type="text/css" />        
        <link href="<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css"/>" rel="stylesheet" />
        
        <script src="<c:url value="/resources/js/jquery-3.2.0.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>       
        <script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-growl/1.0.0/jquery.bootstrap-growl.min.js"/>" type="text/javascript" ></script>        
       
        <title>${title}</title> 
    </head>
    <body> 

        <main class="container">

            <jsp:include page="masterpage/menu.jsp"></jsp:include>

            <jsp:include page="${page}.jsp"></jsp:include>

        </main>

        <jsp:include page="masterpage/footer.jsp"></jsp:include>

    </body>
</html>
