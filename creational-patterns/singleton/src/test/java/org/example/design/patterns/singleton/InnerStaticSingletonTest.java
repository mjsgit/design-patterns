package org.example.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class InnerStaticSingletonTest {
    @Test
    public void lazySingletonTest(){
        InnerStaticSingleton instance1 = InnerStaticSingleton.getInstance();
        InnerStaticSingleton instance2 = InnerStaticSingleton.getInstance();
        Assert.assertEquals(instance1,instance2);
    }
}
