package codeclan.com.homeworkinstrumentclasses;
import codeclan.com.homeworkinstrumentclasses.Instruments.Brass;
import codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType;

import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.ACOUSTIC;
import static org.junit.Assert.*;
import org.junit.*;



/**
 * Created by user on 03/11/2017.
 */




public class BrassTest {

    Brass brass;

    @Before

    public void before() {

        brass = new Brass(ACOUSTIC, 10, 15,3);
    }

    @Test
    public void canGetSoundItMakes() {
        assertEquals("TA-RA-TA-TA", brass.getSoundItMakes());
    }
    @Test
    public void canGetInstrumentType() {
        assertEquals(ACOUSTIC, brass.getInstrumentType());
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(10, brass.getCostPrice(), 0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(15, brass.getSellPrice(),0.01);
    }
    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, brass.getNumberOfValves());
    }
    @Test
    public void canReturnMarkUp() {
        assertEquals(0.5, brass.markUp(),0.01);
    }

}


    