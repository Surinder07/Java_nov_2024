## 

-- top
/*SELECT TOP 3 EMPLOYEE_SALARY
FROM EMPLOYEE
ORDER BY EMPLOYEE_SALARY ASC ;*/



- nested query , find the max salary of employee
  SELECT max(EMPLOYEE_SALARY) from EMPLOYEE
  where EMPLOYEE_SALARY < (SELECT max(EMPLOYEE_SALARY) from EMPLOYEE);

SELECT * , max(EMPLOYEE_SALARY) from EMPLOYEE;

select count(*) from EMPLOYEE;


-- count the employees with salary greater than 50K AND from japan

select count(EMPLOYEE_SALARY) from EMPLOYEE where EMPLOYEE_SALARY > 50000;


-- all the employees

-- SUM
-- find the total salary given to employees
select SUM(EMPLOYEE_SALARY) from EMPLOYEE;

-- AVG
select AVG(EMPLOYEE_SALARY) from EMPLOYEE;


-- top
/*SELECT TOP 3 EMPLOYEE_SALARY
FROM EMPLOYEE
ORDER BY EMPLOYEE_SALARY ASC ;*/

-- LIKE
-- find all the employees whose name starts with J

select * from EMPLOYEE where EMPLOYEE_NAME LIKE 'Sa%';

-- find all whose name has letter s
select * from EMPLOYEE where EMPLOYEE_NAME LIKE '%o%a';


select *
from EMPLOYEE;

-- IN operator
select * from EMPLOYEE where EMPLOYEE_ADDRESS NOT IN ('Japan', 'Canada', 'Tokyo');


-- How many employees are from Canada


select COUNT(*) from EMPLOYEE where EMPLOYEE_ADDRESS IN ('Japan');



-- find the salary between 20K - 50 K

select * from EMPLOYEE where EMPLOYEE_SALARY NOT BETWEEN 20000 AND 50000;








-- Group BY

select EMPLOYEE_ADDRESS, SUM(EMPLOYEE_SALARY)
from EMPLOYEE
GROUP BY EMPLOYEE_ADDRESS ;




-- Order BY

select EMPLOYEE_NAME, EMPLOYEE_SALARY
from EMPLOYEE
ORDER BY EMPLOYEE_SALARY ASC ;




-- JOINS
-- combine two or more tables
-- what is the need?

-- Inner join
-- A 50            B 30  -- returns the matching records between both the tables , 20
-- common - 20

select *
from EMPLOYEE;

select *
from SALARY;


-- Inner join
SELECT  e.EMPLOYEE_ID, e.EMPLOYEE_NAME, s.EMPLOYEE_SALARY, s.FROM_DATE
FROM EMPLOYEE e
INNER JOIN
SALARY s
ON e.EMPLOYEE_ID = s.EMPLOYEE_ID;

-- select column from lefttable join right table ON left table colum = right table column.




-- Left  join  / left outer join   - 50
-- left join will return everything from left table and common between both tables
-- insert query to add a column
INSERT INTO EMPLOYEE values (1008,'Kaviya','India', 647924011, 70000,'F','2017-01-01');


    SELECT  e.EMPLOYEE_ID, e.EMPLOYEE_NAME, s.EMPLOYEE_SALARY, s.FROM_DATE
FROM EMPLOYEE e
LEFT JOIN
SALARY s
ON e.EMPLOYEE_ID = s.EMPLOYEE_ID;


-- Right Join  - 30
-- right join will return everything from right table and common between both tables


       SELECT  e.EMPLOYEE_ID, e.EMPLOYEE_NAME, s.EMPLOYEE_SALARY, s.FROM_DATE
FROM EMPLOYEE e
RIGHT JOIN
SALARY s
ON e.EMPLOYEE_ID = s.EMPLOYEE_ID;

-- Full join

/*    SELECT  e.EMPLOYEE_ID, e.EMPLOYEE_NAME, s.EMPLOYEE_SALARY, s.FROM_DATE
FROM EMPLOYEE e
FULL OUTER JOIN
SALARY s
ON e.EMPLOYEE_ID = s.EMPLOYEE_ID;*/