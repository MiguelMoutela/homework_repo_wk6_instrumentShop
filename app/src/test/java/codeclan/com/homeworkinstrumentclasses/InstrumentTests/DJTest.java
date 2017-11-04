package codeclan.com.homeworkinstrumentclasses.InstrumentTests;


import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Instruments.DJ;
import codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType;

import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.ELECTRIC;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class DJTest {

    DJ mixer;

    @Before
    public void before() {
      mixer = new DJ(ELECTRIC, 10, 20, 3);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1, mixer.markUp(),0.01);
    }
    @Test
    public void canGetSoundItmakes() {
        assertEquals("Puntz Kapuntz", mixer.getSoundItMakes());
    }
    @Test
    public void canGetInstrumentType() {
        assertEquals(ELECTRIC, mixer.getInstrumentType());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(10, mixer.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(20, mixer.getSellPrice(), 0.01);
    }
    @Test
    public void canGetNumberOfInputs() {
        assertEquals(3, mixer.getNumberOfInputs());
    }


}
