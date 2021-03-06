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
        return ((sellPrice-costPrice)/costPrice);
    }

    @Override
    public String getSoundItMakes() {
        return "Squeak Squeak";
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

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
