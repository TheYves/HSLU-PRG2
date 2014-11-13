package ch.hslu.prg2.sw8;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 07.11.2014.
 */
public class Cube implements Comparable<Cube> {

	private int number;
	private int s1, s2, s3;

	public Cube(int no, int a, int b, int c) {
		number = no;
		s1 = a;
		s2 = b;
		s3 = c;
	}

	public int getVolume() {
		return s1 * s2 * s3;
	}

	public int getSurface() {
		return s1 * s2;
	}

	public int maxDimension() {
		int max = s1;
		max = s2 > max ? s2 : max;
		return s3 > max ? s3 : max;
	}

	public String toString() {
		return "CUBE " + number + "\n"
				+ "Sides: " + s1 + " " + s2 + " " + s3 + "\n"
				+ "Volume = " + getVolume() + "\n"
				+ "Surface = " + getSurface();
	}

	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (this == other) {
			return true;
		}
		if (this.getClass() != other.getClass()){
			return false;
		}
		if(this.getVolume() == ((Cube) other).getVolume()) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return getVolume();
	}

	public int compareTo(Cube other) {
		if(this.getVolume() < other.getVolume()){
			return -1;
		}
		if(this.getVolume() > other.getVolume()){
			return 1;
		}
		return 0;
	}

}
