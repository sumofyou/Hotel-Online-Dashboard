<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<c:url value="/users/records" var="recordsUrl" />
<c:url value="/users/create" var="addUrl" />
<c:url value="/users/update" var="editUrl" />
<c:url value="/users/delete" var="deleteUrl" />

<html>
<head>
<link rel='stylesheet' type='text/css' media='screen'
	href='<c:url value="/resources/css/style.css"/>' />
<script type='text/javascript'
	src='<c:url value="/resources/js/jquery-1.8.3.min.js"/>'></script>
<script type='text/javascript'
	src='<c:url value="/resources/js/custom.js"/>'></script>

<title>User Records</title>

<script type='text/javascript'>
	$(function() {
		// init
		urlHolder.records = '${recordsUrl}';
		loadTable();
	});
</script>
</head>

<body>
	<h1 id='banner'>Record System</h1>
	<hr />

	<table id='tableUsers'>
		<caption></caption>
		<thead>
			<tr>
				<th>Username</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
	</table>
</body>
</html>