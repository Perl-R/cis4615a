import java.io.File;

public class R02_XP00_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
    // Rule 02. Expressions (EXP)
    // XP00-J. Do not ignore values returned by methods

    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
          // Handle failure to delete the file
        }
    }
    
}
