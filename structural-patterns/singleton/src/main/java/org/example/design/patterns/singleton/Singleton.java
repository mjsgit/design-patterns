package org.example.design.patterns.singleton;

import java.util.logging.Logger;

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Logger logger = Logger.getLogger(Singleton.class.getName());
    public static Singleton getInstance(){
        if(null == instance){
            logger.info("Creating Singleton instance");
            instance = new Singleton();
        }
        return instance;
    }
}
