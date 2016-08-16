<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	    <link href="<c:url value='/resources/css/app.css'/>" rel="stylesheet"></link>
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.0-rc.5/angular-material.min.js"></script>
		<script src="http://code.jquery.com/jquery-2.1.4.js"></script>
		
		<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
		<script src="<c:url value='/resources/js/bootbox.min.js' />"></script>
		<script src="<c:url value='/resources/js/angular-route.js' />"></script>
		
		<script src="<c:url value='/resources/js/app.module.js' />"></script>
        <script src="<c:url value='/resources/js/app.controller.js' />"></script>
        
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="description" content="Columbus">
		<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
	
	<title>Home</title>
</head>
<body ng-app="testModule" class="ng-cloak">

	<div ng-controller="AppController as appCtrl">
		<div class="generic-container">
			<div class="panel panel-default">
				<div class="panel-heading">
					<span class="lead">회원 가입 </span>
				</div>
				<div class="formcontainer">
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="gameCode">ID</label>
							<div class="col-md-7">
								<input type="text" ng-model="appCtrl.userId"  id="appCtrlUserId" class="form-control input-sm" placeholder="Enter your GameCode" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="gameCode">PW</label>
							<div class="col-md-7">
								<input type="text" ng-model="appCtrl.userPw"  id="appCtrlUserPw" class="form-control input-sm" placeholder="Enter your GameCode" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="gameCode">이름</label>
							<div class="col-md-7">
								<input type="text" ng-model="appCtrl.userName"  id="appCtrlUserName" class="form-control input-sm" placeholder="Enter your GameCode" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
