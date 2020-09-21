package com.xatkit.execution.predicate;

import java.util.function.Predicate;

public class NegatePredicate<T> implements Predicate<T> {

    protected Predicate<? super T> p1;

    public NegatePredicate(Predicate<? super T> p1) {
        this.p1 = p1;
    }
    
    public Predicate<? super T> getP1() {
    	return this.p1;
    }

    @Override
    public boolean test(T t) {
        return !(p1.test(t));
    }
}
