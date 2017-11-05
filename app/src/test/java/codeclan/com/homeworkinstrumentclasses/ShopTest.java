package codeclan.com.homeworkinstrumentclasses;
import java.util.ArrayList;
import java.util.ArrayList.*;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.Cables;
import codeclan.com.homeworkinstrumentclasses.Instruments.Drums;

import codeclan.com.homeworkinstrumentclasses.Instruments.Strings;

import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.DIGITAL;
import static codeclan.com.homeworkinstrumentclasses.Instruments.InstrumentType.ELECTRIC;
import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 04/11/2017.
 */

public class ShopTest {

    Shop musicShop;
    Strings guitar;
    Drums drums;
    Cables cables;


    @Before
    public void before() {
        musicShop = new Shop("thatShop");
        guitar = new Strings(ELECTRIC, 100,145,6);
        drums = new Drums(DIGITAL,400,500,3,5,7);
        cables = new Cables(45,55,20);
    }
    @Test
    public void shopHasName() {
        assertEquals("thatShop", musicShop.getName());
    }
    @Test
    public void shopIsEmpty() {
        assertEquals(0, musicShop.getSize());
    }
    @Test
    public void canAddItemsToShop() {
        musicShop.sellableItems.add(guitar);
        assertEquals(1, musicShop.getSize());
    }
    @Test
    public void canRemoveItemsFromShop() {
        musicShop.sellableItems.add(guitar);
        musicShop.sellableItems.remove(guitar);
        assertEquals(0, musicShop.getSize());
    }
    @Test
    public void hasTotalRealisableValue() {
        assertEquals(600, musicShop.getTotalRealisableValue(),0.01);
    }
    @Test
    public void canKickCustomerOut() {
        assertEquals(["Squeak Squeak","BA-DUM-TSS","GET OUT!"], musicShop.kickCustomerOut());
    }

}
