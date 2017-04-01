package com.mel.java8.interfaceother;

import com.mel.java8.interfaces.Compute;
import com.mel.java8.interfaces.ComputeImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputeUsageTest {

    private Compute compute;
    private ComputeUsage computeUsage;

   @Before
    public void before() {
       compute = new ComputeImpl();
       computeUsage = new ComputeUsage();
   }

    @Test
    public void verify() {
        Assert.assertEquals(18.0, compute.area(9,2), 1);
    }

}
