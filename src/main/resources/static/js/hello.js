angular.module('hello', [])
  .controller('home', function($scope, $http) {
  $http.get('/').success(function(data) {
    $scope.greeting = data;
  })
});