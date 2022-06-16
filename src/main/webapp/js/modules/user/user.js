app.controller('user', ['$scope', '$http', '$window', function ($scope, $http) {
    $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";


    $scope.arrayStatus = []
    $scope.arrayRoles = []
    $scope.rol = {}
    $scope.updateCopy = {}

    $scope.findAllStatus = () => {
        $http({
                method: 'POST',
                url: 'struts_basics/findAllStatus'
            }
        ).then(function (response) {
            console.log($scope.arrayStatus)
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
            console.log(response.data)
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

        console.log("olaxd", $scope.updateCopy)
        $('#UpdateRolModal').modal('toggle')

    }

    $scope.updateRol = () => {
        console.log($scope.arrayStatus)
        console.log($scope.updateCopy)
        $http({
            method: 'POST',
            url: 'struts_basics/updateRol',
            data: `data=${angular.toJson($scope.updateCopy)}`
        }).then((response) => {

            $scope.findAllRoles()
            $('#UpdateRolModal').modal('hide')
        })
    }



}])