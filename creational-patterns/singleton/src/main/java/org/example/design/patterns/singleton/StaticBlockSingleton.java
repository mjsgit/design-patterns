package org.example.design.patterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    // this is useful in case constructor throws exception
    private StaticBlockSingleton() throws Exception{
        // assume some code throwing exception
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            //some exception handling code
        }
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }

}
