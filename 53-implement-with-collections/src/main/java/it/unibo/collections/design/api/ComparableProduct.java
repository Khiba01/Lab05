package it.unibo.collections.design.api;

import it.unibo.collections.design.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{

    public ComparableProduct(String name, int q) {
        super(name, q);
    }

    
    @Override
    public int compareTo(Product arg0) {
        return this.getName().compareTo(arg0.getName());
    }
}
