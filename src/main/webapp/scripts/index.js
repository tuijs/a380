/**
 * http://usejsdoc.org/
 */
var getAircraftsByAirline = function(airline) {
	if (airline === 'CA') {
		return [ 'A380', 'A350', 'A330', 'A320', 'B787', 'B747' ];
	}
	return 'no data';
};

var rs = getAircraftsByAirline();
console.log(rs);
