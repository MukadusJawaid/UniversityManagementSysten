
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.println("LOGIN PAGE");
        // Calling Login factory
        LoginFactory lf = new LoginFactory();
        // calling login page instance from singleton
        Loginpage lp = Loginpage.getInstance();
        System.out.println("ARE YOU AN ADMIN?, A TEACHER OR A STUDENT? ");
        String person = sc.nextLine();
        // Switch case
        if(person=="ADMIN"&&person=="admin"){
                Login Admin = lf.credentials("Admin");
                lp.getUsername();
                lp.getPassword();
                Admin.setCredentials(lp.getUsername(),lp.getPassword());
                Admin.dashboard();
        }
         
        else{
                System.out.println("No such choice available.");
        }
    }
}

