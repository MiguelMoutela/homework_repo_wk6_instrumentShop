package codeclan.com.homeworkinstrumentclasses.InstrumentTests;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Instruments.Drums;

import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.ACOUSTIC;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */


public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(ACOUSTIC, 30,60,2,2,6);
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1, drums.markUp(), 0.01);
    }
    @Test
    public void canGetSoundItMakes() {
        assertEquals("BA-DUM-TSS", drums.getSoundItMakes());
    }
    @Test
    public void canGetInstrumentType() {
        assertEquals(ACOUSTIC, drums.getInstrumentType());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(30, drums.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(60, drums.getSellPrice(),0.01);
    }
    @Test
    public void canGetNumberOfSymbals() {
        assertEquals(2, drums.getNumberOfSymbals());
    }
    @Test
    public void canGetNumberOfBassDrums() {
        assertEquals(2, drums.getNumberOfBassDrums());
    }
    @Test
    public void canGetNumberOfSnareDrums() {
        assertEquals(6, drums.getNumberOfSnareDrums());
    }






}
