package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HanoiRhymerUnitTest {
    HanoiRhymer hanoiRhymer;

    @Before
    public void setUp() {
        hanoiRhymer = new HanoiRhymer();
    }

    @Test
    public void  testReportRejected(){
        int testValue = 0;
        int res = hanoiRhymer.reportRejected();
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testCountIn(){
        int testValue = 4;
        hanoiRhymer.countIn(testValue);
        int res = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue, res);
    }
}
