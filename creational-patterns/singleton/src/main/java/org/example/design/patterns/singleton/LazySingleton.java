package org.example.design.patterns.singleton;

public class LazySingleton {
    //instance not created until someone needs. i.e. calls getInstance()
    private static LazySingleton INSTANCE;

    private LazySingleton(){}

/*
    // 1. Thread safety by synchronized method - being synchronized has performance impact
    public static synchronized LazySingleton getInstance(){
        if(null == INSTANCE){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
*/

    //2. Thread safety by double-checked locking
    public static LazySingleton getInstance(){
        if(null == INSTANCE){
            synchronized (LazySingleton.class){
                if(null == INSTANCE){
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }

}
