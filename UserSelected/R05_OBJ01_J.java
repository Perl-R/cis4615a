public class R05_OBJ01_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
    // Rule 05. Object Orientation (OBJ)
    // OBJ01-J. Limit accessibility of fields
}

/*
 * Accessor methods provide controlled access to fields outside of the package in which their class is declared. 
 * This compliant solution declares total as private and provides a public accessor. 
 * The add() and remove() methods modify its value while preserving class invariants. 
 * 
 * As a public field, total can be altered by client code independently of the add() and remove() methods.
 */
class Widget {
    private int total; // Declared private
   
    public int getTotal () {
      return total;
    }
   
    // Definitions for add() and remove() remain the same
    void add() {
        if (total < Integer.MAX_VALUE) {     
            total++;
            // ...
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
     
    void remove() { 
        if (total > 0) {     
            total--;
            // ...
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
}