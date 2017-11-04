package codeclan.com.homeworkinstrumentclasses.Accesssories;

/**
 * Created by user on 03/11/2017.
 */

public class Cables extends Accessories{

    private int length;

    public Cables(float costPrice, float sellPrice, int length) {
        super(costPrice, sellPrice);
        this.length = length;
    }

    @Override
    public float markUp() {
        return ((sellPrice - costPrice) / costPrice);
    }

    public float getCostPrice() {
        return costPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public int getlength() {
        return length;
    }
}
