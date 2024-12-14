## Method Overloading 

same name but diff parameters




create a method, 

info(name)
(name, email)
(name, email, phone)


## Constructor 

which initilizes the object.
1. it is the same name as the class name 
2. it does not have a return type , not even void  
3. looks similar to method


Rules 
1. default const is present for all the classes by default 
2. if there is a parameterized const, jvm will not create a default const
3. if you need a default const then you have to create in case of presence of param const 






Student st = new Student();


int x = 10;

1. default const   - no parameter
2. Parameterized  - with parameters 










        // Compiler 
Student.java -------> Student.class [Byte code ] // JVM 

## Step 1 : 
javac Student.java

## Step 2 : run the code 

java Student 















