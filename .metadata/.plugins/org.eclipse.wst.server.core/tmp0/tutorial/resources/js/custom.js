/**
 * Contains custom JavaScript code
 */
var urlHolder = new Object();

function loadTable() {
	$.get(urlHolder.records, function(response) {

		$('#tableUsers').find('tbody').remove();

		for ( var i = 0; i < response.users.length; i++) {
			var row = '<tr>';
			row += '<td>' + response.users[i].username + '</td>';
			row += '<td>' + response.users[i].firstName + '</td>';
			row += '<td>' + response.users[i].lastName + '</td>';
			row += '</tr>';
			$('#tableUsers').append(row);
		}

		$('#tableUsers').data('model', response.users);
		;
	});
}
