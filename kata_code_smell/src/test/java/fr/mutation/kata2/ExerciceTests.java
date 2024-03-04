package fr.mutation.kata2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExerciceTests {

    @Test
    public void listeVide() {
        final Exercice exercice = new Exercice();
        final List<Integer> listeEntiers = new ArrayList<>();

        Map<Integer, String> actual = exercice.f1(1, listeEntiers);

        Entry<Integer, String> dualResult = actual.entrySet().iterator().next();
        Assertions.assertThat(dualResult.getKey()).isZero();
        Assertions.assertThat(dualResult.getValue()).isEqualTo("\n");
    }

    @Test
    public void listeAvecDeuxEntiersPositifs() {
        final Exercice exercice = new Exercice();
        final List<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(0);
        listeEntiers.add(20);

        Map<Integer, String> actual = exercice.f1(2, listeEntiers);

        Entry<Integer, String> dualResult = actual.entrySet().iterator().next();
        Assertions.assertThat(dualResult.getKey()).isZero();
        Assertions.assertThat(dualResult.getValue()).isEqualTo("0 20 \n");
    }

    @Test
    public void listeAvecElementsNonPrisEnCompte() {
        final Exercice exercice = new Exercice();
        final List<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(4);
        listeEntiers.add(9);
        listeEntiers.add(14);
        listeEntiers.add(-14);

        Map<Integer, String> actual = exercice.f1(2, listeEntiers);

        Entry<Integer, String> dualResult = actual.entrySet().iterator().next();
        Assertions.assertThat(dualResult.getKey()).isZero();
        Assertions.assertThat(dualResult.getValue()).isEqualTo("4 9 \n");
    }

    @Test
    public void listeAvecUnEntierSuperieur20() {
    	final Exercice exercice = new Exercice();
        final List<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(21);
        
        Map<Integer, String> actual = exercice.f1(1, listeEntiers);

        Entry<Integer, String> dualResult = actual.entrySet().iterator().next();
        Assertions.assertThat(dualResult.getKey()).isEqualTo(1);
        Assertions.assertThat(dualResult.getValue()).isEqualTo("\n");
    }
    
    @Test
    public void listeAvecUnEntierNegatif() {
    	final Exercice exercice = new Exercice();
        final List<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(-1);
        
        Map<Integer, String> actual = exercice.f1(1, listeEntiers);

        Entry<Integer, String> dualResult = actual.entrySet().iterator().next();
        Assertions.assertThat(dualResult.getKey()).isEqualTo(1);
        Assertions.assertThat(dualResult.getValue()).isEqualTo("\n");
    }

}
