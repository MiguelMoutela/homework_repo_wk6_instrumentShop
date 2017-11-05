package codeclan.com.homeworkinstrumentclasses;

import java.util.ArrayList;
import java.util.ArrayList.*;


import codeclan.com.homeworkinstrumentclasses.Instruments.Strings;

/**
 * Created by user on 04/11/2017.
 */

public class Shop {
     String name;
     ArrayList<Sellable>items;
     ArrayList<Playable>items;
     float totalRealisableValue;
     ArrayList<String>allSounds;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<Sellable>();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return items.size();
    }

    public float getTotalRealisableValue() {
        totalRealisableValue = 0;
        for (Sellable item : items) {
            totalRealisableValue += item.markUp();
        }
        return totalRealisableValue;
    }

    public void kickCustomerOut() {
        allSounds = null;
        for (Playable item : items) {
            allSounds.add(item);
        }
        return allSounds;
    }
}
