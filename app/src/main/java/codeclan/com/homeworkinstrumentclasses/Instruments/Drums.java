package codeclan.com.homeworkinstrumentclasses.Instruments;

/**
 * Created by user on 03/11/2017.
 */

public class Drums extends Instrument{

    private int numberOfSymbals;
    private int numberOfBassDrums;
    private int numberofSnareDrums;

    public Drums(InstrumentType type, float costPrice, float sellPrice, int numberOfSymbals, int numberOfBassDrums, int numberofSnareDrums){
        super(type, costPrice, sellPrice);

        this.numberOfSymbals = numberOfSymbals;
        this.numberOfBassDrums = numberOfBassDrums;
        this.numberofSnareDrums = numberofSnareDrums;
    }

    @Override
    public float markUp() {
        return 0;
    }

    @Override
    public String setSoundItMakes() {
        return "BA-DUM-TSS";
    }
}
