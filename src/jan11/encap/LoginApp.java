package jan11.encap;

public class LoginApp {

    String userName;  // pragra
    private String password;  // pragra123

    public LoginApp(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "LoginApp{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void loginUser(String userName, String password){
        if(this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("user is authenticated ");
            System.out.println("Welcome to my app " + userName);
        }
        else {
            System.out.println("Invalid credentials...");
            System.out.println("Please try again.");
        }
    }
}

//boilerplate

// Lombok