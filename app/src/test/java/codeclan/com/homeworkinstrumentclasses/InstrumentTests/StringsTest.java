package codeclan.com.homeworkinstrumentclasses.InstrumentTests;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Instruments.Strings;

import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.ACOUSTIC;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class StringsTest {
    Strings guitar;

    @Before
    public void before() {
        guitar = new Strings(ACOUSTIC, 20,25,7);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(0.25, guitar.markUp(),0.01);
    }
    @Test
    public void canGetSoundItMakes() {
        assertEquals("Squeak Squeak", guitar.getSoundItMakes());
    }
    @Test
    public void canGetInstrumentType() {
        assertEquals(ACOUSTIC, guitar.getInstrumentType());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(20, guitar.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(25, guitar.getSellPrice(),0.01);
    }
    @Test
    public void canGetNumberOfStrings() {
        assertEquals(7, guitar.getNumberOfStrings());
    }


}
