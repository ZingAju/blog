package com.zingscoop.favorComposition;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//public class CounterHashSet<E> extends HashSet<E> {
public class CounterHashSet<E> extends ForwardingSet<E> {
    //Counter to keep track of no of items added since we created the Hashset.
    private int counter = 0;
    public CounterHashSet(Set<E> s) {
        super(s);
        counter += s.size();
    }
    
    public int getCounter() {
        return counter;
    }

    @Override
    public boolean add(E e) {
        System.out.println(" Add ");
        counter++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        counter += c.size();
        return super.addAll(c);
    }
}
