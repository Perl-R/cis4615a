import java.util.regex.Pattern;
import java.util.logging.Logger;

public class R00_IDS03_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
    // Rule 00. Input Validation and Data Sanitization (IDS)
    // IDS03-J. Do not log unsanitized user input

    public static boolean loginSuccessful = true;
    public static String username = "username";
    public static Logger logger = Logger.getLogger("R00_IDS03_J");

    public static void main(String[] args) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) 
            ? username : "unauthorized user";

    }

}
