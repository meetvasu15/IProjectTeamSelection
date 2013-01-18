create table iproject_projectdetail (
	projectID LONG not null primary key,
	projectTitle VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table student_preferences (
	studentID LONG not null primary key,
	ASUID VARCHAR(75) null,
	preference1 VARCHAR(75) null,
	preference2 VARCHAR(75) null,
	preference3 VARCHAR(75) null,
	preference4 VARCHAR(75) null,
	preference5 VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);