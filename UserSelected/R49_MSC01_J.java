

public class R49_MSC01_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop
    // Rule 49 Miscellaneous (MSC)
    // MSC01-J. Do not use an empty infinite loop

    /*
     * 
     * An infinite loop with an empty body consumes CPU cycles but does nothing. 
     * Optimizing compilers and just-in-time systems (JITs) are permitted to (perhaps unexpectedly) remove such a loop. 
     * Consequently, programs must not include infinite loops with empty bodies.
     * 
     */

        
    public final int DURATION=10000; // In milliseconds    
    public void nop() throws InterruptedException {
        while (true) {
            // Useful operations
            Thread.sleep(DURATION);
        }
    }

}
