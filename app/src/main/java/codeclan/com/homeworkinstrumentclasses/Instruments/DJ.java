package codeclan.com.homeworkinstrumentclasses.Instruments;

/**
 * Created by user on 03/11/2017.
 */

public class DJ extends Instrument{

    private int numberOfInputs;

    public DJ(InstrumentType type, float costPrice, float sellPrice, int numberOfInputs){
        super(type, costPrice, sellPrice);

        this.numberOfInputs = numberOfInputs;
    }

    @Override
    public float markUp() {
        return ((sellPrice-costPrice)/costPrice);
    }

    @Override
    public String getSoundItMakes() {
        return "Puntz Kapuntz";
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

    public int getNumberOfInputs() {
        return numberOfInputs;
    }
}
