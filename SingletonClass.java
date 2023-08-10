package demo2;

//2 - singleton class
public class SingletonClass {
    /*
    Singleton is a design pattern in which we guarantee there will only ever be zero or one instance
    of a particular object.
     */

    private static SingletonClass singletonReference;

    private SingletonClass() {

    }

    public static SingletonClass getSingleton() {
        if(singletonReference == null) {
            singletonReference = new SingletonClass();
        }
        return singletonReference;
    }
}

