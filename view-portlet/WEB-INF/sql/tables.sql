create table iProject_iProject (
	projectID LONG not null,
	projectName VARCHAR(75) not null,
	skillset VARCHAR(75) null,
	description VARCHAR(75) null,
	contact VARCHAR(75) null,
	dateAdded DATE null,
	primary key (projectID, projectName)
);

create table iproject_iproject (
	projectID LONG not null,
	projectName VARCHAR(75) not null,
	skillset VARCHAR(75) null,
	description VARCHAR(75) null,
	contact VARCHAR(75) null,
	dateAdded DATE null,
	primary key (projectID, projectName)
);