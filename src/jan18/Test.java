package jan18;

public final class Test {
    public static void main(String[] args) {

        //Address address1 = new Address(110, "Queen st." ,"Toronto" , "Onatrio" ,"M1K 2W3" , "CA");

        Employee employee1 = new Employee(101, "Sahil","sahil@gmail.com",120000.00,
                new Address(110, "Queen st." ,"Toronto" , "Onatrio" ,"M1K 2W3" , "CA"));


        // Student - ---  firstName, middleName, lastName
        // name , email, phone
        // Student -    Name name, String email, String phone
        // Name - String firstName, String middleName, String lastName


        String city = employee1.getAddress().getCity();


        System.out.println(city);
        System.out.println(employee1.toString());





       /* Employee employee2 = new Employee(102, "Rachna","rachna@gmail.com",130000.00, "210 King st, Missisauga, L1K 2W3");
        Employee employee3 = new Employee(103, "Chris","chris@gmail.com",140000.00, "L1K 2W3 , 10 Maine street ");
        Employee employee4 = new Employee(104, "Aradhna","aradhna@gmail.com",150000.00, "1110 This st, Oakville, L1K 2W3");
        Employee employee5 = new Employee(105, "Nat","nat@gmail.com",160000.00, "210 That st, Hamilton, L1K 2W3");
*/


        // address - composite

        /*



        St number
        house
        city
        postal code
        country


         */

    }
}



