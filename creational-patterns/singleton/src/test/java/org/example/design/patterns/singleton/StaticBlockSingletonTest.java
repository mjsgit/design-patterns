package org.example.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class StaticBlockSingletonTest {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Test
    public void singletonTest(){
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        logger.info("instance1 = " + instance1);
        logger.info("instance2 = " + instance2);
        Assert.assertEquals(instance1,instance2);

    }
}
