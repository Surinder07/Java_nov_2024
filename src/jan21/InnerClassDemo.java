package jan21;



class OuterClass {

    int x = 10;

    public void outerClassMethod(){
        System.out.println( "Outer class  X print: "+x);
    }

    // Member Inner class
    class InnerClass {
        int y = 20;

        public void innerClassMethod(){
            System.out.println( "Inner class  X print: "+x);
            System.out.println( "Inner class  Y print: "+x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // create object of the outer class
        OuterClass outerObj = new OuterClass();

        // create object of Inner class with outer class object reference
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.innerClassMethod();


       // OuterClass.InnerClass in = new OuterClass.InnerClass();
    }
}
