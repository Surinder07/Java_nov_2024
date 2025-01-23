package jan21.exceptiondemo;

public class Demo {
    public static void main(String[] args) {

        String name = "Pragra";

        name = null;
        String nameInUpperCase = "";

        try {
             nameInUpperCase = name.toUpperCase();
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(nameInUpperCase);

        System.out.println("hello at line 12 ");

    }
}
/*
try {

}catch(Exception e) {

REST API
CI . CD - Jenkins
AWS  services
RDS- SQL


}


 */
