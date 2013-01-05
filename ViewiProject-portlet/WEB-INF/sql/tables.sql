create table project_projectdetail (
	projectId LONG not null primary key,
	projectTitle VARCHAR(75) null,
	projectdescription VARCHAR(75) null,
	projectrequiredskill VARCHAR(75) null,
	contact VARCHAR(75) null,
	dateAdded DATE null
);