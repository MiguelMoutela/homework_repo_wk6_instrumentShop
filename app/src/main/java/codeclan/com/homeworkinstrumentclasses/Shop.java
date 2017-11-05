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
}
