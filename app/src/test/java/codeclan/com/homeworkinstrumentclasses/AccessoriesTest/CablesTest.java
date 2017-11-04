package codeclan.com.homeworkinstrumentclasses.AccessoriesTest;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.Cables;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class CablesTest {

    Cables cables;

    @Before
    public void before() {
        cables = new Cables(3,6,15);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1, cables.markUp(),0.01);
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(3, cables.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(6, cables.getSellPrice(),0.01);
    }
    @Test
    public void canGetLength() {
        assertEquals(15, cables.getlength());
    }

}
