<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myapp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Information</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
</head>
<body ng-controller="flightInformationController">

<table cellpadding="2" cellspacing="2" border="1">
	<tr>
		<th>Origin airport</th>
		<th>Destination airport</th>			
		<th>Departure time</th>
		<th>Arrival time</th>
		<th>Flight number</th>	
		<th>Carrier name</th>	
	</tr>
	
	<tr ng-repeat="flightinformation in listFlightInformation">
		<td>{{flightinformation.originAirport}}</td>
		<td>{{flightinformation.destinationAirport}}</td>
		<td>{{flightinformation.departureTime}}</td>
		<td>{{flightinformation.arrivalTime}}</td>
		<td>{{flightinformation.flightNumber}}</td>
		<td>{{flightinformation.carrierName}}</td>		
	</tr>
</table>

<script type="text/javascript">
	var myapp = angular.module('myapp', []);
	myapp.controller('flightInformationController', function($scope, $http){
		$http.get('http://localhost:8080/FlightInfoMgmtPortal_Server/rest/flightInformation/findall').success(function(response){
			$scope.listFlightInformation = response.flightInformation;
		});
	});
</script>
</body>
</html>