package ch.hslu.prg2.sw7.mountainsort;

import java.util.Comparator;

public class HeightCompare implements Comparator<Mountain> {

    @Override
    public int compare(Mountain b1, Mountain b2) {
        if(b1.getHeight() > b2.getHeight()) {
            return 1;
        }
        if(b1.getHeight() < b2.getHeight()) {
            return -1;
        }
        return 0;
    }
}
