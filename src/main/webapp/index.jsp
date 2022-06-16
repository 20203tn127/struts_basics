<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html ng-app="CourseStruts" lang="es">
<head>
    <jsp:include page="/views/layout/head.jsp"/>

    <title>Inicio</title>
</head>
<body ng-controller="user" style="background: rgb(238,174,202);
    background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);">
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
        <br>
        <hr>

        <div class="container">
            <div class="col-12">
                <table class="table table-hover text-center" ng-init="findAllRoles()">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Estado</th>
                        <th scope="col">Acciones</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="rol in arrayRoles | orderBy:'status.name'">
                        <td ng-bind="$index + 1"></td>
                        <td ng-bind="rol.name" ></td>
                        <td ng-bind="rol.status.name" ng-class="rol.status.name === 'Activo' ? 'text-success' : 'text-danger'"></td>
                        <td>
                            <button class="btn btn-info" ng-click="detailsRolModal(rol)">Details</button>
                            <button class="btn btn-warning" ng-click="updateRolModal(rol)">Modificar</button>
                            <button class="btn btn-danger">Eliminar</button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>


    </div>


</div>


<jsp:include page="views/components/roles/rolModal.jsp"/>
<jsp:include page="views/layout/footer.jsp"/>
</body>
</html>