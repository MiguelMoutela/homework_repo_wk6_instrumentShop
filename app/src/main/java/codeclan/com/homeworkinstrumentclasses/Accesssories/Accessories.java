package codeclan.com.homeworkinstrumentclasses.Accesssories;

import codeclan.com.homeworkinstrumentclasses.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Accessories implements Sellable {

    private float costPrice;
    private float sellPrice;

    public Accessories(float costPrice, float sellPrice) {

        this.costPrice = costPrice;
        this.sellPrice = sellPrice;

    }

}
