function leapyear(year) {
	return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}
console.log(leapyear(2024));
console.log(leapyear(2002));
console.log(leapyear(1999));
console.log(leapyear(1968));
console.log(leapyear(1980));