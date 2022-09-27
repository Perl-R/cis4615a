import java.io.Serializable;

public class R14_SER00_J {
    
    // https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
    // Rule 14. Serialization (SER)
    // SER00-J. Enable serialization compatibility during class evolution

    /*
     * Once an object of a particular class has been serialized, 
     * future refactoring of the class's code often becomes problematic. 
     * Specifically, existing serialized forms (encoded representations) 
     * become part of the object's published API and must be supported for an indefinite period. 
     * This can be troublesome from a security perspective; not only does it promote dead code, 
     * it also forces the provider to maintain a compatible codebase for the lifetime of their products.
     * 
     * Classes that implement Serializable without overriding its functionality are said to be using 
     * the default serialized form. In the event the class changes, 
     * byte streams produced by users of old versions of the class become incompatible with the 
     * new implementation. Consequently, serializable classes that rely on the default 
     * serialized form cannot be evolved without compromising compatibility.
     */    
}

class GameWeapon implements Serializable {
    private static final long serialVersionUID = 24L;
   
    int numOfWeapons = 10;
           
    public String toString() {
      return String.valueOf(numOfWeapons);
    }
  }
  