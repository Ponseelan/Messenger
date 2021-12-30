CREATE TABLE USERS
(
id int PRIMARY KEY,
FirstName varchar(50),
LastName varchar(50),
DateOfBirth date,
LoginId varchar(50),
unique (LoginId)
);


CREATE SEQUENCE hibernate_sequence START 1;


Create table Messages
(
id int PRIMARY KEY,
fromid int not null,
toid int not null,
message varchar(50) not null,
status varchar(50) not null,
   CONSTRAINT fk_from
      FOREIGN KEY(fromid)
	  REFERENCES Users(id),
	  CONSTRAINT fk_to
            FOREIGN KEY(toid)
      	  REFERENCES Users(id)
)