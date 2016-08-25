<%-- 
    Document   : loginForm
    Created on : 23/08/2016, 11:25:57 AM
    Author     : geotor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form class="form-signin" action="/login" method="POST">
    <h2 class="form-signin-heading">Please sign in</h2>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="text" id="inputEmail" name="email" class="form-control" placeholder="Email address" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
    <div class="checkbox">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>

    <c:if test="${param.error ne null}">
        <div class="alert-danger">Invalid username and password.</div>
    </c:if>
    <c:if test="${param.logout ne null}">
        <div class="alert-normal">You have been logged out.</div>
    </c:if>  
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />

</form>

