package jan4;

public class Phone {

    public void call(){
        System.out.println("Calling...");
    }

}

class Mobile extends Phone {

    @Override
    public void call() {
        System.out.println("calling from mobile phone..");
    }
}