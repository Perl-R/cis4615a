public class R07_ERR04_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/ERR04-J.+Do+not+complete+abruptly+from+a+finally+block
    // Rule 07. Exceptional Behavior (ERR)
    // ERR04-J. Do not complete abruptly from a finally block

    /*
     *  Never use return, break, continue, or throw statements within a finally block. 
     * 
     *  Statements that cause the finally block to complete abruptly also cause the try block to complete abruptly and 
     *  consequently suppress any exception thrown from the try or catch blocks.
     */
}

class TryFinally {
    private static boolean doLogic() {
        try {
            throw new IllegalStateException();
        } finally {
            System.out.println("logic done");
        }
        // Any return statements must go here;
        // applicable only when exception is thrown conditionally
    }
}