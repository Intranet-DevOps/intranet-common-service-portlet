create table intranet_attachment (
	attachmentId INTEGER not null primary key,
	entityType VARCHAR(75) null,
	entityId INTEGER,
	attachmentText VARCHAR(75) null
);

create table intranet_employee (
	employeeId INTEGER not null primary key,
	screenName VARCHAR(75) null,
	joinDate DATE null,
	leaveDate DATE null
);

create table intranet_project (
	projectId INTEGER not null primary key,
	code_ VARCHAR(75) null,
	description VARCHAR(75) null
);