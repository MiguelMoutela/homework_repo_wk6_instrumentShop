package codeclan.com.homeworkinstrumentclasses.Accesssories;

import codeclan.com.homeworkinstrumentclasses.Playable;
import codeclan.com.homeworkinstrumentclasses.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public class AudioBooksDvdsAndSheetMusic extends Accessories implements Playable {

    private String title;


    public AudioBooksDvdsAndSheetMusic(float costPrice, float sellPrice, String title){

        super(costPrice, sellPrice);

        this.title = title;
    }

    @Override
    public float markUp() {
        return 0;
    }

    @Override
    public String getSoundItMakes() {
        return "It instructs.";
    }
}
