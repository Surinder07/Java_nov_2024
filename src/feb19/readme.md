
## RDS 

Relational data service 


Dynamo DB 

What is database? 
store data, persist the data 



Two types 
1. SQL  - relational database - Tabular format - rows/columns

Mysql , Oracle , MS SQL server , postgres db , SQLite, H2 database 


2. NOSQL - non relational - document based DB - JSON 

Mongo DB , dynamo db , redis[caching], cassandra 




A - atomiticity
C - Consistency 
I - Isolation 
D - Durability 




SQL - Structured Query Language 

My sql work bench 
D Beaver 
Datagrip 


Mysql - database Software 
SQL - Language  


DBA - database admin 


DBMS - database management sytstem 
RDBMS - relational dbms


DDL - Data definition language  - create, alter, drop 
DCL - Data control language - Grant, revoke
DML - Data manipulation Language - CRUD- create read update delete
insert 
select 
update 
delete 


DQL - Data query language 
Select 


Trading companies, banks, citi - 
Multi threading and database 
Morgan stantely , chase bank , citi, jp morgan 



Normalization 
remove the redundant data 
1nf -5 nf

## Relational database 

why? 

Interview : Joins 


## SQL queries 

show databases ;

use pragra;

-- to check the tables
show tables ;

select * from EMPLOYEE;

select EMPLOYEE_ID, EMPLOYEE_NAME from EMPLOYEE;



-- where clause
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan';

-- smith and from Japan

-- AND
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan' AND EMPLOYEE_NAME = 'Smith';

-- OR
-- write a query for person name = john or person from Singapore
select * from EMPLOYEE where EMPLOYEE_NAME ='john' OR EMPLOYEE_ADDRESS = 'Singapore';

-- NOT
-- list all the records where employee is not from Canada
select * from EMPLOYEE where EMPLOYEE_ADDRESS != 'Canada'


-- Limit
select * from EMPLOYEE limit 3;
-- 1M record , CPU will spike



-- Order by name
select * from EMPLOYEE order by EMPLOYEE_NAME desc ;

create database mydatabase;

drop database mydatabase;


-- how to create tables

-- create table table_name(field1, field2.....)
create table Student(id int, name varchar(255));

show tables;

select * from Student;


-- insert into tableName()
insert into Student(id , name, course) values ('101','Sahil', 'Java');
drop table Student;

-- alter
alter table Student add course varchar(255);

-- rename columns

ALTER table Student RENAME COLUMN  id to Student_id;


-- interview
-- fetch the max/min of employee table
-- second highest salary from employee table ----- Inteview QUestion


-- How many employees are there from Japan ?
-- average salary
-- two tables, some data in the table, =  if you do a join, how many rows will be returned












