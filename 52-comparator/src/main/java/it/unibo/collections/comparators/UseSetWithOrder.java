package it.unibo.collections.comparators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.element.Element;

import it.unibo.MyComparator;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        Collection<String> treeSet = new TreeSet<>(new MyComparator());
        // NOTA: posso mettere un comparatore nel costruttore di TreeSet peerchè è accettato (vedi Javadoc)
        //       e lo utilizza in modo autonomo per riordinare gli elementi già nel momento in cui vengono addati
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        final int MAX_POPULATION = 100;
        for (int i = 0; i < MAX_POPULATION; i++) {
            treeSet.add(Double.toString(Math.random()));
        }
        treeSet.add("-1E10");// test per verificare
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.println(treeSet);
    }
}
