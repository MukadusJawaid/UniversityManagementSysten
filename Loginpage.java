
import java.util.Scanner;

// Signleton applied in this class
public class Loginpage {
    // taking input
   
    Scanner sc = new Scanner(System.in);
    // private the username
    private String username;
    // private the password
    private String password;
    // Calling the object of Login Page
    private static Loginpage lp = new Loginpage();
    // getting username
    public String getUsername() {

        return username;
    }
    // getting password
    public String getPassword() {

        return password;
    }
    // Setting username
    private void setUsername(String username) {

        this.username = username;

    }
    // Setting password
    private void setPassword(String password) {

        this.password = password;
    }
    // call the object of loginPage
    Loginpage(){}

    public static Loginpage getInstance() {

        return lp;
    }
    // Display function
    public void loginDisplay(){
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        setUsername(username);
        setPassword(password);

    }

}
