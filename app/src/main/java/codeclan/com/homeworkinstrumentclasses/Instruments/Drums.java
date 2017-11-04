package codeclan.com.homeworkinstrumentclasses.Instruments;

/**
 * Created by user on 03/11/2017.
 */

public class Drums extends Instrument{

    private int numberOfSymbals;
    private int numberOfBassDrums;
    private int numberOfSnareDrums;

    public Drums(InstrumentType type, float costPrice, float sellPrice, int numberOfSymbals, int numberOfBassDrums, int numberOfSnareDrums){
        super(type, costPrice, sellPrice);

        this.numberOfSymbals = numberOfSymbals;
        this.numberOfBassDrums = numberOfBassDrums;
        this.numberOfSnareDrums = numberOfSnareDrums;
    }

    @Override
    public float markUp() {
        return ((sellPrice-costPrice)/costPrice);
    }
    @Override
    public String getSoundItMakes() {
        return "BA-DUM-TSS";
    }

    public InstrumentType getInstrumentType() {
        return type;
    }

    public float getCostPrice() {
        return costPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public int getNumberOfSymbals() {
        return numberOfSymbals;
    }

    public int getNumberOfBassDrums() {
        return numberOfBassDrums;
    }

    public int getNumberOfSnareDrums() {
        return numberOfSnareDrums;
    }
}
