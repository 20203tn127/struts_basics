<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html ng-app="CourseStruts" lang="es">
<head>
    <jsp:include page="/views/layout/head.jsp"/>

    <title>Inicio</title>
</head>
<body ng-controller="user">
<jsp:include page="views/layout/slidebar.jsp"/>
<div class="container-fluid">
    <div class="row">
       <div class="col-12">
           <h1 class="text-center text-md-left" style="color: white">Gestión de Roles</h1>
           <hr class="bg-primary">
       </div>
        <div class="col-12 text-center text-md-right">
            <button class="btn btn-outline-light " data-toggle="modal" data-target="#registerRolModal">
                Agregar
            </button>
        </div>

    </div>


</div>







<jsp:include page="views/components/roles/rolModal.jsp"/>
<jsp:include page="views/layout/footer.jsp"/>
</body>
</html>