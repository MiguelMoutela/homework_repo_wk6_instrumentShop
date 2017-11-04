package codeclan.com.homeworkinstrumentclasses.Accesssories;

import codeclan.com.homeworkinstrumentclasses.Playable;

/**
 * Created by user on 03/11/2017.
 */

public class Amplification extends Accessories implements Playable {

    private int watts;

    public Amplification (float costPrice, float sellPrice, int watts){
        super(costPrice, sellPrice);
        this.watts = watts;
    }

    @Override
    public float markUp() {
        return ((sellPrice-costPrice)/costPrice);
    }

    public String getSoundItMakes(){
        return "feedback";
    }

    public float getCostPrice() {
        return costPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public int getWatts() {
        return watts;
    }
}
