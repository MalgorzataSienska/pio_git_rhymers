package edu.kis.vh.nursery;

import org.junit.Assert;

public class FIFORhymerUnitTest {
    final int EMPTY_STACK = -1;

    public void testCountOut(){
        FIFORhymer rhymer = new FIFORhymer();
        int res = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK, res);

        int testValue = 4;
        rhymer.countIn(testValue);

        res = rhymer.countOut();
        Assert.assertEquals(testValue,res);

        res = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK, res);
    }
}
