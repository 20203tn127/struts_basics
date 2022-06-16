app.controller('user', ['$scope', '$http', '$window', function ($scope, $http) {
    $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";


    $scope.arrayStatus = []
    $scope.arrayRoles = []
    $scope.rol = {}

    $scope.findAllStatus = () => {
        $http({
                method: 'POST',
                url: 'struts_basics/findAllStatus'
            }
        ).then(function (response) {
            const {data: {listStatus}} = response;
            $scope.arrayStatus = listStatus

        })
    }

    $scope.findAllRoles = () => {
        $http({
                method: 'POST',
                url: 'struts_basics/findAllRoles'
            }
        ).then(function (response) {
            const {data: {listRoles}} = response;
            $scope.arrayRoles = listRoles

        })
    }

    $scope.createRol = () => {
        $http({
            method: 'POST',
            url: 'struts_basics/createRol',
            data: `data=${angular.toJson($scope.rol)}`
        }).then((response) => {
            $scope.findAllRoles()
            $('#registerRolModal').modal('hide')
        })
    }

    $scope.detailsRolModal = (rol) =>{
        $scope.detailRolCopy = angular.copy(rol)
        console.log($scope.detailRolCopy)
        $('#detailsRolModal').modal('toggle')
    }

    $scope.updateRolModal = (rol) =>{
        $scope.updateRolCopy = angular.copy(rol)
        $('#UpdateRolModal').modal('toggle')
    }

    $scope.updateRol = () => {
        console.log($scope.updateRolCopy)
        $http({
            method: 'POST',
            url: 'struts_basics/updateRol',
            data: `data=${angular.toJson($scope.updateRolCopy)}`
        }).then((response) => {
            $scope.findAllRoles()
            $('#UpdateRolModal').modal('hide')
        })
    }



}])