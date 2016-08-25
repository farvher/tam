<%-- 
    Document   : menu
    Created on : 6/08/2015, 02:31:38 PM
    Author     : farvher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default navbar-static-top navbar-inverse ">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand " href="<%=request.getContextPath().toString()%>">
                <!--<img  class="img-rounded" src="<%=request.getContextPath().toString()%>/resources/img/icono.png" style="width: 80px"/>-->
          ShareFiler
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li ><a href="#">Link </a></li>
                <li><a href="/login?salir">salir</a></li>
            </ul>
            <form class="navbar-form navbar-left" role="search" onsubmit="return busquedaBasicaURL(document.getElementById('busqueda').value, document.getElementById('ubicado').value)" method="GET"  >
                <div class="form-group">
                    <input type="text" class="form-control " id="busqueda" name="busqueda" placeholder="Buscar ...">
                </div>
                <input type="submit" class="btn btn-default" value="Buscar">
            </form>

            <form class="navbar-form">
                <a class="btn  btn-default" id="falseinput"> <span class="glyphicon glyphicon-upload"></span></a>
                <a class="btn  btn-success" id="cargando" style="display: none">
                    <span class="glyphicon glyphicon-refresh glyphicon-refresh-animate">
                    </span>
                </a>
            </form>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->

</nav>


<br/>
<br/>
<br/>
<br/>

