package it.unibo.collections.sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import javax.lang.model.element.Element;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> treeSet = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        final int MAX_POPULATION = 20;
        for (int i = 1; i <= MAX_POPULATION; i++ ) {
            treeSet.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(treeSet);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */

        Iterator<String> sI = treeSet.iterator();
        while (sI.hasNext()) {
            if (Integer.valueOf(sI.next()) % 3 == 0)
            sI.remove();
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (var element : treeSet) {
            System.out.println(element);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        for (var element : treeSet) {
            if (Integer.valueOf(element) % 2 == 0){
                System.out.println("["+element+"]"+"Even!");
            }
        }
    }
}
