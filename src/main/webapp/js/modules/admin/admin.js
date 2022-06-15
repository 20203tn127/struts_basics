
app.controller('user', ['$scope', '$http', '$window', function ($scope, $http){
    $http.defaults.headers.post["content-type"] = "application/x-www-form-urlencoded";


    $scope.arrayStatus = []

    $scope.findAllStatus= () => {
        $http({
            method: 'POST',
            url: 'Struts_Basics/findAllStatus'
            }
        ).then(function (response){
            console.log(response)
        })
    }




}])