package jan11.encap;

public class LoginMain {
    public static void main(String[] args) {

        LoginApp loginMain = new LoginApp("pragra","pragra123");
        String password = loginMain.getPassword();

        System.out.println("Hey this is your old password " + password);




        /*

HOME take assignment
           Intellij Software --->  execute it

           word document --- read only   --- getter only

           excel - read and write  -- getter and setter both

        Create a class FileDemo

         boolean isReadable
        boolean isWritable

        create getter setter to make class a Readonly or Write Only or both ...











         */













       /* LoginApp loginMain = new LoginApp("pragra","pragra123");
        loginMain.loginUser("pragra","pragra123");

        System.out.println();
        // some hacker
      // loginMain.password = "Mypassword";

        loginMain.setPassword("MyPassword");
        loginMain.loginUser("pragra","Mypassword");

        loginMain.setUserName("MyUserName");

        System.out.println();
        loginMain.loginUser("MyUserName","Mypassword");*/




    }
}
