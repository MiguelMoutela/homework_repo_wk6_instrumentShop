package codeclan.com.homeworkinstrumentclasses.Accesssories;

/**
 * Created by user on 03/11/2017.
 */

public class Amplification extends Accessories{

    private int watts;

    public Amplification (float costPrice, float sellPrice, int watts){
        super(costPrice, sellPrice);
        this.watts = watts;
    }

    @Override
    public float markUp() {
        return 0;
    }
}
