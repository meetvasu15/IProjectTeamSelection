create table TeamDetails (
	teamID LONG not null primary key,
	projectTitle VARCHAR(75) null,
	faculty1 VARCHAR(75) null,
	faculty2 VARCHAR(75) null,
	faculty3 VARCHAR(75) null,
	faculty4 VARCHAR(75) null,
	student0 VARCHAR(75) null,
	student1 VARCHAR(75) null,
	student2 VARCHAR(75) null,
	student3 VARCHAR(75) null,
	student4 VARCHAR(75) null,
	student5 VARCHAR(75) null,
	student6 VARCHAR(75) null,
	student7 VARCHAR(75) null,
	student8 VARCHAR(75) null,
	student9 VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table faculty (
	facultyID LONG not null primary key,
	asuid VARCHAR(75) null,
	facultyName VARCHAR(75) null,
	facultyDept VARCHAR(75) null,
	contact VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table manualSelect_Foo (
	fooId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table manualSelect_preferences (
	facultyID LONG not null primary key,
	ASUID VARCHAR(75) null,
	preference1 VARCHAR(75) null,
	preference2 VARCHAR(75) null,
	preference3 VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table project_projectdetail (
	projectID LONG not null primary key,
	projectTitle VARCHAR(75) null,
	projectdescription VARCHAR(75) null,
	sponsor VARCHAR(75) null,
	projectrequiredskill VARCHAR(75) null,
	contact VARCHAR(75) null,
	status VARCHAR(75) null,
	link VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table student (
	studentID LONG not null primary key,
	asuid VARCHAR(75) null,
	studentName VARCHAR(75) null,
	level VARCHAR(75) null,
	course VARCHAR(75) null,
	gpa VARCHAR(75) null,
	sex VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);

create table student_skillset (
	studentID LONG not null primary key,
	asuid VARCHAR(75) null,
	Project_Management VARCHAR(75) null,
	Technical_Writing VARCHAR(75) null,
	Oral_Presentation VARCHAR(75) null,
	Thermo_Fluids VARCHAR(75) null,
	Data_Analysis VARCHAR(75) null,
	Leadership VARCHAR(75) null,
	Automation VARCHAR(75) null,
	Mechanical_Design VARCHAR(75) null,
	Fabrication_Welding VARCHAR(75) null,
	Machining_CNC VARCHAR(75) null,
	Heat_Transfer VARCHAR(75) null,
	Electronics VARCHAR(75) null,
	Microcontrollers VARCHAR(75) null,
	GUI_and_Programming VARCHAR(75) null,
	LabView VARCHAR(75) null,
	Embedded_Systems VARCHAR(75) null,
	CADD VARCHAR(75) null,
	FEA VARCHAR(75) null,
	Civil_Engineering VARCHAR(75) null,
	dateAdded DATE null
);