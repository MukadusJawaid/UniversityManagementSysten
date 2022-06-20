// Interface for Login Factory
interface Login {
    public void setCredentials(String username, String password);
    public void dashboard();
}
public class LoginFactory {
    // Login factory instance
    public Login credentials(String usercredentials) {
        if(usercredentials == null) {
            return null;
        }
        // Applying Conditional statements
        else if(usercredentials.equalsIgnoreCase("Admin")) {
            return (Login) new Admin();
        }
        else if(instanceCategory.equalsIgnoreCase("Teacher")) {
            return (Login) new Teacher();
        }
        else if(instanceCategory.equalsIgnoreCase("Student")) {
            return (Login) new Student();
        }
        return null;
    }
}
