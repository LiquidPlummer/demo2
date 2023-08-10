package demo2;

public class Main {
        public static void main (String[]args){//program entry point
        Object myFirstObjectReferenceExample = new Object();

        MyNewClass aClassReferenceVariable = new MyNewClass();
        MyNewClass aDeepCopy = new MyNewClass();
        MyNewClass anotherReference = new MyNewClass();

        System.out.println(aClassReferenceVariable.toString());
        System.out.println(anotherReference.toString());

//        System.out.println("Are they equal?   " + aClassReferenceVariable.equals(aDeepCopy));

        Worker myWorkerReference = new Worker();

        String myStringHereInMain = "Hello, world";
        int myIntPrimitiveLocatedInMain = 5;

        /*
        Java is a pass-by-value language which means when we call a method and pass parameters,
        we pass copies of their values. What this means is that when we manipulate the variable in the method
        we do not change the original. However, in terms of references, we do indeed copy the value of the reference,
        but both copies point to the real and original object in memory, so changes made to that object
        are very real and permanent.
         */
        String mySubString = myWorkerReference.doWork(myStringHereInMain, myIntPrimitiveLocatedInMain);
        System.out.println("Substring: " + mySubString);


    }
}
