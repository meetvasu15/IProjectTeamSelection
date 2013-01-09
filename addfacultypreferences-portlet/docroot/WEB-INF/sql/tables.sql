create table LMS_LMSBook (
	bookId LONG not null primary key,
	asuid VARCHAR(75) null,
	email VARCHAR(75) null,
	dateAdded DATE null
);

create table LNS_LNSBook (
	nameId LONG not null primary key,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	number_ VARCHAR(75) null,
	dateAdded DATE null
);