package codeclan.com.homeworkinstrumentclasses.AccessoriesTest;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.homeworkinstrumentclasses.Accesssories.AudioBooksDvdsAndSheetMusic;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class AudioBooksDvdsAndSheetMusicTest {

    AudioBooksDvdsAndSheetMusic trueFireDvd;

    @Before
    public void before() {
        trueFireDvd = new AudioBooksDvdsAndSheetMusic(2, 5, "Robben Ford: Rhythm Revolution");
    }
    @Test
    public void canGetSountItMakes() {
        assertEquals("It instructs", trueFireDvd.getSoundItMakes());
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(1.5, trueFireDvd.markUp(),0.01);
    }
    @Test
    public void canGetCostPrice() {
        assertEquals(2, trueFireDvd.getCostPrice(),0.01);
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(5, trueFireDvd.getSellPrice(), 0.01);
    }
    @Test
    public void canGetTitle() {
        assertEquals("Robben Ford: Rhythm Revolution", trueFireDvd.getTitle());
    }
}
