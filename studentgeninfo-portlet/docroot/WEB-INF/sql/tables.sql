create table Studentgeninfo_studentgeninfo (
	studentgeninfoid LONG not null primary key,
	name VARCHAR(75) null,
	asuid LONG,
	department VARCHAR(75) null,
	level LONG,
	cummulativegpa DOUBLE,
	loggedinuserId LONG,
	createDate DATE null,
	modifiedDate DATE null
);