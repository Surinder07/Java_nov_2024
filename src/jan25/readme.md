## Recap 


Inner class 
Anonymous inner 
static inner class 


Exception Handling 
Custom exceptions 
try , catch, finally, throw , throws 

## Important Interview Questions 

final vs finally vs finalize
String vs StringBuilder vs StringBuffer
Singleton class
throw vs throws
method overloading vs overriding 
runtime polymorphism vs compile time 
checked vs unchecked exceptions 



throw is to throw an exception , create your exception for a situation 
throws is put on method signature, caller that method should handle the exception.


## Collections
manipulate group of objects 



        Group of interfaces and various classes 


                    Iterable [I]
                        |
                    Collection [I]
        |               |               |
      List[I]             Set[I]              Queu[I]                       Map [I]  
     |                  |               |                            |   
ArrayList           HashSet             Deque[I]                     HashMap, ConcurrentHashMap  
LinkedList         LinkedHashSet        PriorityQueue               
                    TreeSet             ArrayDeque          
    |
Stack 

## Collections class 
## Arrays 


NOTE : collections does not work with primitive types,
it works with object types only 


int, float , double , boolean etc 

Wrapper 
converting primtive to Objects - 

primitive             Wrapper class
int                 - Integer 

## Type casting [read more online]
// type casting  - convert one type to another type
double x = 10.53242;
int y = (int)x;

        System.out.println(y);


ArrayList vs Array 

Array are fixed in size 
ArrayList is dynamic 


under the hood arraylist is backed by array


## Generics 
<>

## ArrayList
internally is array 
dynamic, size grow 
Homogenous because of Generics







        ArrayList al = new ArrayList();
Java 7 



Threshold
load factor 


default size of 10 was created


n + n/2 + 1 


10 + 10/2 +1 
16 





Java 7 - default size of 10 was created.
ArrayList al = new ArrayList();
SIZE = 10

Java 8 - default size of 0 is created 
the moment you enter first element 
size of 10 will be created.
ArrayList al = new ArrayList(); 
SIZE = 0
al.add(10);
size 10 





Given an array list 
100 elements 








## LinkedList 

1. Singly linked List 
2. Doublly Linked List 





Big O - read about this 

space and 

time complexity - how fast or slow the algorithm is 
worst case scenario 


Arraylist   - app is more search intensive , read ops 
LinkedList  - manipulation , update, delete 

$0.1   x 1M x 10 apps



// swap the array elements 






Worst case 
Best case 
























