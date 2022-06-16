<%--
  Created by IntelliJ IDEA.
  User: omand
  Date: 14/06/2022
  Time: 09:20 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Modal registro-->
<div class="modal fade" id="registerRolModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Register Rol OG</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-12">
                            <div class="form-group">
                                <label>Nombre:<span class="text-danger"></span></label>
                                <input class="form-control" type="text" placeholder="Administrador" required min="2" maxlength="45" ng-model="rol.name" name="name"/>
                            </div>
                            <div class="form-group" ng-init="findAllStatus()">
                                <label>Estado:<span class="text-danger"></span></label>
                                <select name="" id="" class="form-control" ng-model="rol.status" name="status" ng-options="status.name for status in arrayStatus track by status.id" required>
                                    <option value="" disabled>Seleccione</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-danger" data-dismiss="modal">Cerrar</button>
                <button type="button" class="btn btn-outline-warning" ng-click="createRol()">Guardar</button>
            </div>
        </div>
    </div>
</div>

<%--modalDetalles--%>
<div class="modal fade" id="detailsRolModal" tabindex="-1" aria-labelledby="exampleModalLabel1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel1">Details Rol g my G's</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12">
                        <div class="form-group">
                            <label>Nombre:<span class="text-danger"></span></label>
                            <input class="form-control" type="text" ng-model="detailRolCopy.name" name="detailsName" disabled/>
                        </div>
                        <div class="form-group" ng-init="findAllStatus()">
                            <label>Estado:<span class="text-danger"></span></label>
                            <select name=""  class="form-control" ng-model="detailRolCopy.status" name="detailsStatus" ng-options="status.name for status in arrayStatus track by status.name" disabled>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-warning" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
    </div>
</div>

<%--UpdateRolModal--%>
<div class="modal fade" id="UpdateRolModal" tabindex="-1" aria-labelledby="exampleModalLabel1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel2">Update Rols</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12">
                        <div class="form-group">
                            <label>Nombre:<span class="text-danger"></span></label>
                            <input class="form-control" type="text" ng-model="updateCopy.name" name="name" />
                        </div>
                        <div class="form-group" ng-init="findAllStatus()">
                            <label>Estado:<span class="text-danger"></span></label>
                            <select class="form-control" ng-options="status.name for status in arrayStatus track by status.id"  ng-model="updateCopy.status" name="status" required>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-warning" data-dismiss="modal">Cerrar</button>
                <button type="button" class="btn btn-outline-success" ng-click="updateRol()">Guardar</button>
            </div>
        </div>
    </div>
</div>