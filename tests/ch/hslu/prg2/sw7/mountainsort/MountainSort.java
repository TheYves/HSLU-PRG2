package ch.hslu.prg2.sw7.mountainsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MountainSort<T> {

    private List<Mountain> bergListe = new ArrayList<>();

    public void sortiereBerge() {
        bergListe.add(new Mountain("Weisshorn", 2653)); // Arosa
        bergListe.add(new Mountain("Weisshorn", 4505)); // Wallis
        bergListe.add(new Mountain("Pilatus", 2128));
        bergListe.add(new Mountain("Rigi", 1797));
        bergListe.add(new Mountain("Stanserhorn", 1898));
        bergListe.add(new Mountain("Titlis", 3238));
        bergListe.add(new Mountain("Bürgenstock", 1128));
        System.out.println("\nEingabereihenfolge: \n " + bergListe);

        HeightCompare hv = new HeightCompare();
        Collections.sort(bergListe);
        System.out.println("\nAlfabetisch nach Namen\n " + bergListe);

        Collections.sort(bergListe, hv);
        System.out.println("\nnach aufsteigender Höhe: \n " + bergListe);
    }
}
