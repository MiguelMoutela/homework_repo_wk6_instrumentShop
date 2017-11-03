package codeclan.com.homeworkinstrumentclasses.Instruments;

import codeclan.com.homeworkinstrumentclasses.Playable;
import codeclan.com.homeworkinstrumentclasses.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    InstrumentType type;
    float costPrice;
    float sellPrice;


    public Instrument(InstrumentType type, float costPrice, float sellPrice){
        this.type = type;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

}

