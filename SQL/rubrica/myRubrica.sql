Drop database if exists Rubrica;

#Create a new database rubrica 
create database Rubrica
	default character set latin1
    default collate latin1_general_ci;
    #instruction to operate in phone in next line
use Rubrica;

#change set of character
alter database Rubrica
	default character set utf8
    default collate utf8_unicode_ci;

#create new table country 
Drop table if exists country;

create table country(
	code varchar(2) not null,
    name varchar(32) not null,
    primary key (code)    
);




# if table exists, will drop it    
Drop table if exists brand;

#create a new table brand 
create table brand(
	id int(11) not null auto_increment, # id is a primary key 
    name varchar(32) not null,
    country varchar(2) not null,
    primary key (id),
    foreign key(country) references country(code)
);    




Drop table if exists opsys;

#create new table opsys 
create table opsys(
	
    id int(11) not null auto_increment,
    description varchar(32) not null,
    company varchar(32) not null,
    openSource tinyint(1) not null,
	primary key (id)
);















Drop table if exists smartphone;

#create new table smartphone
create table Smartphone(
	 id int(11) not null auto_increment,
     name varchar(64) not null,
     ram varchar(5) not null,
     cpu varchar(64) not null,
     displayPpi int(11) not null,
     displaySize varchar(12) not null,
	 displayResolution varchar(64) not null,
	 size varchar(64) not null,
	 weight int(4) not null,
     notes varchar(1024) not null,
     brand int(11) not null,
     opsys int(11) not null,
	 primary key (id),
     foreign key(brand) references brand(id),
     foreign key(opsys) references opsys(id)
);


Drop table if exists utente;

#create new table opsys 
create table utente(
	
    id int(11) not null auto_increment,
    name varchar(32) not null,
    surname varchar(32) not null,
    age int(11) not null,
    telephone int(11) not null,
    smart int (11) not null,
	primary key (id),
    foreign key(smart) references smartphone(id)
);

