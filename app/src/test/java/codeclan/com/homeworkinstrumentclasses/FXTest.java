package codeclan.com.homeworkinstrumentclasses;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.FX;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class FXTest {

    FX dudeOverdrive;

    @Before
    public void before() {
        dudeOverdrive = new FX(5,10,false);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1, dudeOverdrive.markUp(),0.01);
    }
    @Test
    public void canGetSoundItMakes() {
        assertEquals("Special FX sounds", dudeOverdrive.getSoundItMakes());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(5, dudeOverdrive.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(10, dudeOverdrive.getSellPrice(),0.01);
    }
    @Test
    public void canGetBattery() {
        assertEquals(false, dudeOverdrive.getBattery());
    }

}
