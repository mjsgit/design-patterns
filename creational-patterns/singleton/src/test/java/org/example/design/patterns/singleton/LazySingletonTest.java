package org.example.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazySingletonTest {

    @Test
    public void lazySingletonTest(){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assert.assertEquals(instance1,instance2);
    }
}
