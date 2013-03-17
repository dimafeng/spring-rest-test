function UserListCtrl($scope, $http) {
    $http.get('/api/users/getUsers').success(function (data) {
        $scope.users = data;
    });

    $scope.addUser = function () {
        $http({
            url: "/api/users/addUser",
            method: "POST",
            data: {"username": $scope.username}
        }).success(function(data, status, headers, config) {
            $scope.users.push(data)
        });
    };
}