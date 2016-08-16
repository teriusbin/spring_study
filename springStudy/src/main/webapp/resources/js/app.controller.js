'use strict';
 
var AppCon = (App.controller('AppController', ['$scope', '$location', function($scope,$location) {
			
			  $scope.$on('$routeChangeStart', function(next, current) { 
				  $scope.pageName = $location.url().replace("/", "").toUpperCase();
				  console.log($scope.pageName);
			   });
			  
			  //$scope.pageName = $location.url().replace("/", "");
          	  $scope.change = function(){
        //	  console.log('ss:'+$scope.ColumbusGV+','+this.appCtrl.ColumbusGV.gameCode);
//        	  ColumbusGV=self.ColumbusGV;
        	  ColumbusGV.gameCode = this.appCtrl.ColumbusGV.gameCode;
        
        	  var patern_elements = document.getElementsByClassName("patternCode form-control input-sm");
        	  for(var i=0; i<patern_elements.length; i++) {
        		  if(patern_elements[i].id == "gameCode") patern_elements[i].value = ColumbusGV.gameCode;
        	  }
        	  var elements = document.getElementsByClassName("form-control input-sm");
        	  for(var i=0; i<elements.length; i++) {
        		  if(elements[i].id == "gameCode")  elements[i].value = ColumbusGV.gameCode;
        	  }
          };
//          ColumbusGV.gameCode=self.ColumbusGV;
      }]));

   
