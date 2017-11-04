package codeclan.com.homeworkinstrumentclasses.Instruments;

/**
 * Created by user on 03/11/2017.
 */

public class Brass extends Instrument{

    private int numberOfValves;

    public Brass(InstrumentType type, float costPrice, float sellPrice, int numberOfValves){
        super(type, costPrice, sellPrice);

        this.numberOfValves = numberOfValves;
    }

    @Override
    public float markUp() {
        return 0;
    }

    @Override
    public String getSoundItMakes() {
        return "TA-RA-TA-TA";
    }
}
