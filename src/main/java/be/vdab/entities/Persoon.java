package be.vdab.entities;

import java.util.Iterator;
import java.util.List;

/**
 * @author guillaume.vandecasteele on 09/09/2015 at 10:04.
 */
public class Persoon {
    private final List<String> voornamen;

    public Persoon(List<String> voornamen) {
        if (voornamen == null) throw new NullPointerException();
        if (voornamen.size() < 1) throw new IllegalArgumentException();
        for (String voornaam : voornamen) {
            if (voornaam == null) throw new NullPointerException();
            if (voornaam.length() < 1) throw new IllegalArgumentException();
            if (voornamen.lastIndexOf(voornaam) != voornamen.indexOf(voornaam)) throw new IllegalArgumentException();
        }
        this.voornamen = voornamen;
    }

    public String toString() {
        StringBuilder voornamen = new StringBuilder();
        Iterator<String> iterator = this.voornamen.iterator();
        while (iterator.hasNext()) {
            voornamen.append(iterator.next());
            if (iterator.hasNext()) {
                voornamen.append(" ");
            }
        }
        return voornamen.toString();
    }
}
