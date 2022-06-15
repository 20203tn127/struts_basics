<%--
  Created by IntelliJ IDEA.
  User: omand
  Date: 14/06/2022
  Time: 08:38 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%String context = request.getContextPath();%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

    <a class="navbar-brand" href="<%=context%>/index.jsp"><img src="<%=context%>/assets/Apache_Struts_2_logo.svg.png" width="100" height="40" alt=""></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" >Inicio <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=context%>/index.jsp">Gestión de Roles</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=context%>/views/user/user.jsp">Gestión de Usuario</a>
            </li>

        </ul>
    </div>
</nav>