package demo2;

public class Worker {



    /*
    The shape of every method declaration:
        Signature - [access modifiers] - [non-access modifier] - return type - method name(symbol) - parameter list inside parentheses
        Body - the block of code which contains instruction to complete

        This is an example of abstraction. The signature is the exposed interface,
        the body is the hidden implementation details.

    The two sides of the Method coin: Method declaration, method invocation
        method declaration - writing the method signature and the method body - we declare something new exists
            Ex: public static void methodNameInPascalCase(String parameter1, String parameter2);
        method invocation - from the calling code, we start a behavior (we jump to that method, and begin executing
        instructions there.) "at runtime, begin executing the method body" is what is happening in english
            Ex: object.methodName("hello", "world");
     */
    public final String doWork(String stringParameter, int indexParameter) {

        return stringParameter.substring(0, indexParameter);

    }
}
