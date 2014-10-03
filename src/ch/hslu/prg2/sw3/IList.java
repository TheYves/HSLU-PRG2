package ch.hslu.prg2.sw3;

/**
 * Created by Yves on 03.10.2014.
 */
public interface IList {
	/**
	 * Diese Methode erhält ein Integer-Objekt und gibt nichts zurück. Das Objekt wird in die Liste eingefügt.
	 */
	public void add(Integer number);

	/**
	 * Diese Methode erhält ein Integer-Objekt. Dieses wird (ein Vorkommen) aus der Liste entfernt. Wenn das Objekt
	 * entfernt werden konnte, gibt die Methode true zurück, andernfalls false.
	 */
	public boolean remove(Integer number);

	/**
	 * Diese Methode erhält einen ganzzahligen Wert und entfernt ein Integer-Objekt mit diesem Wert. Konnte ein solches
	 * Objekt entfernt werden, gibt die Methode true zurück, false sonst.
	 */
	public boolean removeValue(int number);

	/**
	 * Diese Methode erhält einen ganzzahligen Wert und entfernt alle Integer-Objekte mit diesem
	 * Wert. Konnten alle Objekte entfernt werden, gibt die Methode true zurück, false sonst
	 */
	public boolean removeValues(int number);

	/**
	 * Diese Methode gibt die Anzahl Elemente in der Liste zurück.
	 */
	public int size();

	/**
	 * Diese Methode erhält einen ganzzahligen Wert. Sie gibt true zurück, falls ein Integer-Objekt mit diesem Wert
	 * existiert, false sonst.
	 */
	public boolean exists(int number);

	/**
	 * Diese Methode gibt alle Werte der Integer-Objekte in der Liste aus.
	 */
	public void print();
}
