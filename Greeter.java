public class Greeter {

    // Instance variable to store the greeter's name.
    // Each Greeter object has its own "name".
    String name;
    
    /*
     * Constructor: defines how to create a Greeter object.
     * Takes a String parameter (aName) and stores it in the "name" field.
     */
    public Greeter(String aName) {
        name = aName;
    }

    // Returns a greeting message using the "name" field.
    // Public so it can be called from other classes (e.g., GreeterTester).
    public String sayHello() {
        return "Hello, " + name + "!";
    }
}
