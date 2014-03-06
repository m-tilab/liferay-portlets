create table addtocontactsportlet_emailaddress (
	emailId LONG not null primary key,
	createDate DATE null,
	email VARCHAR(75) null
);

create table addtocontactsportlet_emailcontact (
	emailId LONG not null primary key,
	createDate DATE null,
	email VARCHAR(75) null
);