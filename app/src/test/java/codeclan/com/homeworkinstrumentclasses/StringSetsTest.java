package codeclan.com.homeworkinstrumentclasses;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.StringSets;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class StringSetsTest {
    StringSets earnieBalls;

    @Before
    public void before() {
        earnieBalls = new StringSets(1, 2,11);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1, earnieBalls.markUp(),0.01);
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(1, earnieBalls.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(2, earnieBalls.getSellPrice(),0.01);
    }
    @Test
    public void canGetGauge() {
        assertEquals(11, earnieBalls.getGauge());
    }
}
