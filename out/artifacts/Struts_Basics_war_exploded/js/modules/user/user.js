
app.controller('user', ['$scope', '$http', '$window', function ($scope, $http){
    $http.defaults.headers.post["content-type"] = "application/x-www-form-urlencoded";


    $scope.arrayStatus = []
    $scope.rol = {}

    $scope.findAllStatus= () => {
        $http({
            method: 'POST',
            url: 'struts_basics/findAllStatus'
            }
        ).then(function (response){
            const {data:{listStatus}} = response;
            $scope.arrayStatus = listStatus
            console.log($scope.arrayStatus)

        })
    }

    $scope.createRol = ()=>{
        $http({
            method: 'POST',
            url: 'struts_basics/createRol',
            data: `data=${angular.toJson($scope.rol)}`
        }).then( (response) =>{
            console.log(response)
        })
    }




}])