package ch.hslu.prg2.sw8;

import java.util.Comparator;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 13.11.2014.
 */
public class MaxDimensionsComparator implements Comparator<Cube> {

	@Override
	public int compare(Cube c1, Cube c2) {
		if(c1.equals(c2)) {
			return 0;
		}
		if(c1.maxDimension() > c2.maxDimension()) {
			return 1;
		}
		if(c1.maxDimension() < c2.maxDimension()) {
			return -1;
		}
		return 0;
	}

}
