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
    public float markUp() {
        return ((sellPrice-costPrice)/costPrice);
    }
    public String getSoundItMakes() {
        return "TA-RA-TA-TA";
    }
    public InstrumentType getInstrumentType() {
        return type;
    }
    public float getCostPrice(){
        return costPrice;
    }
    public float getSellPrice(){
        return sellPrice;
    }
    public int getNumberOfValves(){
        return numberOfValves;
    }


}
