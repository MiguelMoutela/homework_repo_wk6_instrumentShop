package codeclan.com.homeworkinstrumentclasses.Accesssories;

import codeclan.com.homeworkinstrumentclasses.Playable;

/**
 * Created by user on 03/11/2017.
 */

public class FX extends Accessories implements Playable {

    private boolean battery;

    public FX(float costPrice, float sellPrice, boolean battery){
        super(costPrice, sellPrice);
        this.battery = battery;
    }

    @Override
    public float markUp() {
        return 0;
    }
    public String setSoundItMakes(){
        return "Special FX sounds.";
    }
}
