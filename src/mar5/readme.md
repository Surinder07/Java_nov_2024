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
