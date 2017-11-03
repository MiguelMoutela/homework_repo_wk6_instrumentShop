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
        return 0;
    }
}
