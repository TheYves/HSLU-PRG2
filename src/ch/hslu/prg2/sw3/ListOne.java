package ch.hslu.prg2.sw3;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Yves on 03.10.2014.
 */
public class ListOne implements IList {

	protected AbstractList<Integer> list;

	public ListOne() {
		list = new ArrayList<>();
	}

	/**
	 * Diese Methode erhält ein Integer-Objekt und gibt nichts zurück. Das Objekt wird in die Liste eingefügt.
	 */
	public void add(Integer number) {
		list.add(number);
	}

	/**
	 * Diese Methode erhält ein Integer-Objekt. Dieses wird (ein Vorkommen) aus der Liste entfernt. Wenn das Objekt
	 * entfernt werden konnte, gibt die Methode true zurück, andernfalls false.
	 */
	public boolean remove(Integer number) {
		return list.remove(number);
	}

	/**
	 * Diese Methode erhält einen ganzzahligen Wert und entfernt ein Integer-Objekt mit diesem Wert. Konnte ein solches
	 * Objekt entfernt werden, gibt die Methode true zurück, false sonst.
	 */
	public boolean removeValue(int number) {
		return list.remove(new Integer(number));
	}

	/**
	 * Diese Methode erhält einen ganzzahligen Wert und entfernt alle Integer-Objekte mit diesem
	 * Wert. Konnten alle Objekte entfernt werden, gibt die Methode true zurück, false sonst
	 */
	public boolean removeValues(int number) {
		Integer value = new Integer(number);
		boolean result;

		do {
			result = list.remove(value);
		} while(result);

		return result;
	}

	/**
	 * Diese Methode gibt die Anzahl Elemente in der Liste zurück.
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Diese Methode erhält einen ganzzahligen Wert. Sie gibt true zurück, falls ein Integer-Objekt mit diesem Wert
	 * existiert, false sonst.
	 */
	public boolean exists(int number) {
		return list.indexOf(new Integer(number)) >= 0;
	}

	/**
	 * Diese Methode gibt alle Werte der Integer-Objekte in der Liste aus.
	 */
	public void print() {
		for(Iterator<Integer> i = list.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}
}
