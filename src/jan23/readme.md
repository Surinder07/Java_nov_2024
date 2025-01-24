## Recap 

 Inner class 
 1. Anonymous Inner class 
2. Local inner class 
3. static inner class 
4. Member inner class




public abstract class X {
public abstract void test();
}

class Main {
psvm(){

X x = new X(){
  
    void test(){

    sout("Hello")
    }

};
    x.test();
}
}


@Overide - annotations 


Functional Interfaces - Java 8 

@Functional,




## Exception
which breaks normal flow of exception 

handling these gracefully is called as exception handling 


try catch 
throw vs throws 
finally vs final vs finalize


## Finally 
finally block will execute always, 
no mater if the exception is caught or not 
closing the resources 

except one scenario - interview question [Google it]


DB      ------> source,  
Scanner -----> some exception occured , 


5-10 mins , 



throw -   you create your own exception for a particular scenario

throw new RuntimeException 

throws - you throw this exception for someone else/ any method [caller of that method] has to handle
this exception. 





