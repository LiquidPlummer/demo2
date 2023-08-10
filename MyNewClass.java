package demo2;

public class MyNewClass {
    /*
    A class is the name for an encapsulation in java, and in many languages. A class is a fairly common term. Recall
    the definition of encapsulation:
    "The bundling of data and behaviors into a logical unit (the class). A class should control modification to its
    internal state."
    The simplest form of an encapsulation, the simplest class, would be one private firld (member variable) and one set
    of public mutators to get and set the value of that variable. Here we have several, with corresponding getters and
    setters.
     */
    /*
    Access modifiers - These keywords are placed before a field to control access to that field. In general your fields
    will be private. Occasionally you may have reason to make them public, but this is widely considered poor practice.
    Sometimes you may have the need to use one of the other access levels, protected and package-private.
    public - wide open for everyone - completely unlocked, no restrictions at all
    protected - accessible within this class, inheriting classes, and classes in this package
    "package-private" - NOT A KEYWORD! Only accessible to this class, and classes in this package. You get this level if
          you do not specify any other. Sometimes called "default" but this would be technically incorrect because
          "default" actually has a different meaning in java.
    private - locked down everywhere except within this file - no one else has access
     */


    /*
    For the purposes of this example I have set these to the 4 different possible access levels, pretend though they are
    all private. This would be the most basic setup for a simple encapsulation.
     */
    public String firstName;
    protected String lastName;
    private String username;
    String password;





    //behaviors - methods, member functions

    /*
    This is the constructor, a special type of method, which has no return type, and is invoked by the
    new keyword in order to build a new object from this class. It has no return type because all constructors
    return the memory address of the newly created object.
     */

    public MyNewClass() {
        //blank constructor
        //if we had instructions in here they would be executing as part of the line in main that instantiates the object
        System.out.println("MyNewClass instantiated!");

    }



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstNameParameter) {
        //maybe do some validation like stopping code injection here
        firstName = firstNameParameter;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String toString() {
        return lastName + ", " + firstName;
    }


    public boolean equals(MyNewClass that) {
        if(this.getFirstName() == that.getFirstName()
                && this.getLastName() == that.getLastName()
                && this.getUsername() == that.getUsername()
                && this.getPassword() == that.getPassword()) {
            return true;
        }

        return false;

    }
}
