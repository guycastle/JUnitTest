package be.vdab.entities;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author guillaume.vandecasteele on 09/09/2015 at 10:01.
 */
public class PersoonTest {

    @Test(expected = IllegalArgumentException.class)
    public void iedereVoornaamMoetMinstensUit1TekenBestaan() {
        new Persoon(Arrays.asList("Guillaume", "", "Paul", ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void iederePersoonHeeftMinstens1Voornaam() {
        new Persoon(new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void eenPersoonMagNiet2KeerDezelfdeVoornaamHebben() {
        new Persoon(Arrays.asList("Guillaume", "Guillaume"));
    }

    @Test
    public void eenPersoonMetMinstens1VoornaamDieMinstens1TekenBevatWordtAanvaard() {
        new Persoon(Arrays.asList("G"));
    }

    @Test
    public void eenPersoonToStringGeeftAlleVoornamenGescheidenDoorSpatie() {
        Persoon persoon = new Persoon(Arrays.asList("Guillaume", "Philippe", "Paul", "Jean"));
        assertTrue(persoon.toString().equals("Guillaume Philippe Paul Jean"));
    }

    @Test(expected = NullPointerException.class)
    public void persoonAanmakenMetNullArrayMagNiet() {
        new Persoon(null);
    }

    @Test
    public void eenPersoonAanmakenMetEenVerzamelingMetSlechts1VoornaamMag() {
        new Persoon(Arrays.asList("Guillaume"));
    }

    @Test(expected = NullPointerException.class)
    public void eenPersoonMetVoornaamNullMagNiet() {
        new Persoon(Arrays.asList("Guillaume", null, "Paul"));
    }

    @Test
    public void eenPersoonMetMeerdereVoornamenMag() {
        new Persoon(Arrays.asList("Guillaume", "Philippe", "Paul", "Jean"));
    }
}