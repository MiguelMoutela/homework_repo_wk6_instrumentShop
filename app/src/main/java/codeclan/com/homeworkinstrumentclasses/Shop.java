package codeclan.com.homeworkinstrumentclasses;

import java.util.ArrayList;
import java.util.ArrayList.*;


import codeclan.com.homeworkinstrumentclasses.Instruments.Strings;

/**
 * Created by user on 04/11/2017.
 */

public class Shop {
     String name;
     ArrayList<Sellable>sellableItems;
     ArrayList<Playable>playableItems;
     float totalRealisableValue;
     ArrayList<String>allSounds;
     String shopManagerYell;

    public Shop(String name) {
        this.name = name;
//        this.sellableItems = new ArrayList<Sellable>();
//        this.playableItems = new ArrayList<Playable>();
//        this.allSounds = new ArrayList<String>();
//        this.totalRealisableValue = totalRealisableValue;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return sellableItems.size();
    }

    public float getTotalRealisableValue() {
//        totalRealisableValue = 0;
        for (Sellable item : sellableItems) {
            totalRealisableValue += item.markUp();
        }
        return totalRealisableValue;
    }

    public void kickCustomerOut() {
//        allSounds = [];
        shopManagerYell = "GET OUT!";
        for (Playable item : playableItems) {
            allSounds.add(item.getSoundItMakes());
        }
        allSounds.add(shopManagerYell);
        return allSounds;
    }
}
