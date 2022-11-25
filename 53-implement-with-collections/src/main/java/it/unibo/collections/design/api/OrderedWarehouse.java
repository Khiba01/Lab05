package it.unibo.collections.design.api;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrderedWarehouse extends WarehouseImpl {

   @Override
   public Set<Product> allProducts() {
       return new TreeSet<>(super.allProducts()); 
        // NOTA: Set già ordinato perchè ho implementato Comparable + compareTo()
        //       faccio new perchè devo ricreare set per ordinarli
        //       NB: con TreeSet funziona probabilmente perchè costruttore accetta Comparator
   }
}
