package it.unibo.collections.design.api;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

    protected final Collection<Product> lkHashSet = new LinkedHashSet<>();
    
    public WarehouseImpl() {
    }

    @Override
    public void addProduct(Product p) {
        lkHashSet.add(Objects.requireNonNull(p));    
    }

    @Override
    public Set<String> allNames() {
        final Set<String> newSet = new LinkedHashSet<String>();
        for (final Product p : this.lkHashSet) {
            newSet.add(p.getName());
        }
        return newSet;
    }

    @Override
    public Set<Product> allProducts() {
        final Set<Product> newSet = new LinkedHashSet<>();
        for (final Product p : this.lkHashSet) {
            newSet.add(p);
        }
        return newSet;
    }

    @Override
    public boolean containsProduct(Product p) {
        return lkHashSet.contains(p);
    }

    @Override
    public double getQuantity(String name) {
        for (var element : lkHashSet) {
            if (element.getName().equals(name)) {
                return element.getQuantity();
            }
        }
        return -1;
    }
    
}
