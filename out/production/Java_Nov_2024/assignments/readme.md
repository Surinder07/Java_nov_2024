## Assignment 

using switch case 
Build an IVR application 

Press 1 for English 
     1. Internet
            1. Billing 
            2. Change in plan 
            3. 
     2. mobile 
     3. Technical support
     4. sales 
    

Press 2 for French

## Assignment 2 

ava Assignments based on Arrays and String
1. Product Inventory Management
   You are managing an inventory system for an online store. Create a Java program that uses an
   array to store the names of 5 products and another array to store their corresponding prices.
   Write a function that:
   • Displays all products with their prices.
   • Allows the user to search for a product by name and retrieve its price.
2. Library Book Management
   A library stores a list of book titles. Create a Java program that uses a string array to store 6 book
   titles. Write functions that:
   • Searches for a specific book title entered by the user.
   • Replaces a specific book title in the array if a user wants to update the library records.
3. Grocery Store Price Calculator
   You are working at a grocery store that offers 5 different fruits. Create a Java program that:
   • Uses two arrays: one for storing the names of fruits and another for storing their prices
   per kilogram.
   • Allows the user to input the fruit name and the number of kilograms they want to
   purchase, then calculates and prints the total price.
4. Flight Booking System
   You are building a system for an airline company. Write a Java program that stores the names of
   5 destinations in a string array. Create methods to:
   • Search for a destination and confirm whether it’s available.
   • Allow a user to update the name of a destination.
5. Customer Feedback System
   A restaurant collects feedback from customers. Create a Java program that stores customer
   reviews (up to 5) in an array. Write functions that:
   • Displays all customer reviews.
   • Allows the user to search for specific words in the reviews and returns reviews that
   match.
6. Movie Rating System
   You are managing a movie rating system where users rate movies. Write a Java program that:
   • Stores the names of 5 movies in a string array and stores ratings (out of 5) in another
   array.
   • Finds the movie with the highest rating and displays it to the user.
7. Classroom Attendance Tracker
   You are building a system for a school to track student attendance. Create a Java program that:
   • Uses an array to store the names of students present in the class on a particular day.
   • Allows the user to enter a student's name and check if they attended the class.
8. E-commerce Sales Analysis
   An e-commerce website tracks the number of sales made for different products each day of the
   week. Write a Java program that:
   • Stores the names of 7 products and the number of sales made for each in two separate
   arrays.
   • Allows the user to search for a product and view its total sales.


## Assignment 3

Assignment: University Management System (Enhanced Version)
Objective:
Develop a University Management System in Java that uses static, final, this, super, inheritance, and polymorphism to manage and display information about students, professors, and university departments.
Requirements:
1. Base Class: Person
   o Fields: name (String), age (int).
   o Constructor: Accepts name and age.
   o Methods:
   ▪ public void displayInfo(): Prints name and age.
   ▪ A final method getType(): Returns "Person".
2. Subclass: Student (Inherits Person)
   o Additional Fields: studentId (String), course (String), gpa (double).
   o Constructor: Accepts name, age, studentId, course, and gpa. Use this to initialize studentId, course, and gpa, and super to call the base class constructor.
   o Override Methods:
   ▪ displayInfo(): Prints name, age, studentId, course, and gpa.
   ▪ Use polymorphism to change the output based on the Person reference type.
3. Subclass: Professor (Inherits Person)
   o Additional Fields: employeeId (String), department (String), salary (double).
   o Constructor: Accepts name, age, employeeId, department, and salary. Use this and super appropriately.
   o Override Methods:
   ▪ displayInfo(): Prints name, age, employeeId, department, and salary.
4. New Subclass: DepartmentHead (Inherits Professor)
   o Additional Field: officeRoom (String).
   o Constructor: Accepts all Professor parameters plus officeRoom.
   o Override Methods:
   ▪ displayInfo(): Prints all Professor details along with officeRoom.
5. Class: University
   o Static Fields:
   ▪ universityName (String)
   ▪ totalStudents (int)
   ▪ totalProfessors (int).
   o Static Methods:
   ▪ setUniversityName(String name): Sets the university name.
   ▪ incrementStudentCount(): Increments the totalStudents counter.
   ▪ incrementProfessorCount(): Increments the totalProfessors counter.
   ▪ getStatistics(): Returns the university name, total students, and total professors.
6. Class: Main
   o Set the university name using the static method in the University class.
   o Create an array of Person references containing a mix of Student, Professor, and DepartmentHead objects.
   o Iterate over the array and call displayInfo() on each object (demonstrating polymorphism).
   o Increment the totalStudents and totalProfessors counters whenever a Student or Professor object is added.
   o Display the university statistics at the end.


Sample Output:

University: Global Tech University

Name: Alice Smith
Age: 20
Student ID: S12345
Course: Computer Science
GPA: 3.9

Name: Dr. John Doe
Age: 45
Employee ID: P67890
Department: Software Engineering
Salary: $95,000.00

Name: Dr. Sarah Lee
Age: 50
Employee ID: P98765
Department: Computer Science
Salary: $120,000.00
Office Room: A-105

--- University Statistics ---
Total Students: 1
Total Professors: 2

Guidelines:
1. Use comments to explain how static, final, this, super, inheritance, and polymorphism are used in your code.
2. Ensure the code is modular and adheres to OOP principles.
3. Use appropriate access modifiers (e.g., private, protected, public).
 


