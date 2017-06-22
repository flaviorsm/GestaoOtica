<%-- 
    Document   : menu
    Created on : 08/04/2017, 00:34:07
    Author     : Flavio
--%>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="inicio" class="navbar-brand">${title}</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">          
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        Gerenciar <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">                        
                        <li><a href="gerenciar">Usuário</a></li>
<!--                        <li><a href="#">Cliente</a></li>-->
                    </ul>
                </li>  
                <li class="dropdown">
                    <a href="logout" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">
                        <div style="color: red">Sair</div>
                    </a>                    
                </li>   
            </ul>
        </div><!--/.navbar-collapse -->
    </div>
</nav>