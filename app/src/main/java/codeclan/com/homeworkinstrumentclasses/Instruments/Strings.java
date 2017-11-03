package codeclan.com.homeworkinstrumentclasses.Instruments;

/**
 * Created by user on 03/11/2017.
 */

public class Strings extends Instrument{

    private int numberOfStrings;

    public Strings(InstrumentType type, float costPrice, float sellPrice, int numberOfStrings){
        super(type, costPrice, sellPrice);

        this.numberOfStrings = numberOfStrings;

    }
    @Override
    public float markUp() {
        return 0;
    }

    @Override
    public String setSoundItMakes() {
        return null;
    }
}
