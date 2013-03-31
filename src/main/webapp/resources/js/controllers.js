function UserListCtrl($scope, $http) {
    $http.get('/api/users/').success(function (data) {
        $scope.users = data;
    });

    $scope.addUser = function() {
        $http({
            url: "/api/users/",
            method: "POST",
            data: {"username": $scope.username}
        }).success(function(data, status, headers, config) {
            $scope.users.push(data)
        });
    };

    $scope.remove = function(id) {
        var removeUrl = "/api/users/"+id;
        $http({
            url: removeUrl,
            method: "DELETE"
        }).success(function(data, status, headers, config) {
                angular.forEach($scope.users,
                    function(value, key) {
                        if(value.id == id) {
                            $scope.users.splice(key, 1);
                        }
                    },
                    $scope.users);
        });
    };
}