package org.example.design.patterns.singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    //private static final long serialVersionUID = 1L;

    private SingletonSerializable(){
        if(null != INSTANCE){
            throw new RuntimeException("Singleton instance already exists!");
        }
    }
    private static final SingletonSerializable INSTANCE = new SingletonSerializable();

    public static SingletonSerializable getInstance(){
        return INSTANCE;
    }

    //readResolve will ensure that even after de-serialization same object is returned.
    protected Object readResolve(){
        return INSTANCE;
    }
}
