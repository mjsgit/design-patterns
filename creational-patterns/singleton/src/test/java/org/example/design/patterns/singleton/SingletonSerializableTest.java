package org.example.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonSerializableTest {
    Logger logger = Logger.getLogger(getClass().getName());
    @Test
    public void singletonTest() throws IOException, ClassNotFoundException{
        SingletonSerializable writeObject = SingletonSerializable.getInstance();
        logger.info("Before serialization: " + writeObject);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.test"));
        out.writeObject(writeObject);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1.test"));
        SingletonSerializable readObject = (SingletonSerializable) in.readObject();
        logger.info("After deserialization: " + readObject);

        //same hashcode of both objects serialized and de-serialized
        Assert.assertEquals(writeObject, readObject);

    }
}
