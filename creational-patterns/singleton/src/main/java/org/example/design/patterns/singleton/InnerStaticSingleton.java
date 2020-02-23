package org.example.design.patterns.singleton;

public class InnerStaticSingleton {
    private InnerStaticSingleton(){}

    //thread safety is already taken care
    private static class Impl{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        return Impl.INSTANCE;
    }

}
