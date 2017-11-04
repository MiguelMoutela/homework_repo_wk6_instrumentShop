package codeclan.com.homeworkinstrumentclasses.Accesssories;

/**
 * Created by user on 03/11/2017.
 */

public class StringSets extends Accessories{

    private int gauge;

    public StringSets(float costPrice, float sellPrice, int gauge){
        super(costPrice, sellPrice);
        this.gauge = gauge;
    }

    @Override
    public float markUp() {
        return ((sellPrice-costPrice)/costPrice);
    }

    public float getCostPrice() {
        return costPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public int getGauge() {
        return gauge;
    }
}
