package ch.hslu.prg2.sw7.mountainsort;

public class Mountain implements Comparable<Mountain> {

	private String name;
	private int height;
	private double latitude, longitude;

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return name + " " + height;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}

		if (other == null) {
			return false;
		}

		if (other instanceof Mountain) {
			Mountain otherMountain = (Mountain) other;
			if (this.name == otherMountain.name && this.height == otherMountain.height) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() * 17 + this.height;
	}

	@Override
	public int compareTo(Mountain other) {
		if (!this.name.equals(other)) {
			return this.name.compareTo(other.name);
		}
		if (this.height < other.height) {
			return -1;
		}
		if (this.height > other.height) {
			return 1;
		}
		return 0;
	}
}
