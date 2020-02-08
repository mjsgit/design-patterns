package org.example.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class SingletonTest {

    private static Logger logger = Logger.getLogger(SingletonTest.class.getName());

    @Test
    public void singletonTest(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        logger.info("instance1 = " + instance1.toString());
        logger.info("instance2 = " + instance2.toString());
        Assert.assertEquals(instance1,instance2);

    }
}
