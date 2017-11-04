package codeclan.com.homeworkinstrumentclasses;


import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.Amplification;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class AmplificationTest {

    Amplification amp;

    @Before
    public void before() {
        amp = new Amplification(40,60,37);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(0.5, amp.markUp(),0.01);
    }
    @Test
    public void canGetSoundItMakes() {
        assertEquals("feedback", amp.getSoundItMakes());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(40, amp.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(60, amp.getSellPrice(), 0.01);
    }
    @Test
    public void canGetWatts() {
        assertEquals(37, amp.getWatts());
    }



}