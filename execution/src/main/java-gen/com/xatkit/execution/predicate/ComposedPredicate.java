package com.xatkit.execution.predicate;

import java.util.function.Predicate;

public abstract class ComposedPredicate<T> implements Predicate<T> {

    protected Predicate<? super T> p1;

    protected Predicate<? super T> p2;

    public ComposedPredicate(Predicate<? super T> p1, Predicate<? super T> p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Predicate<? super T> getP1() {
    	return this.p1;
    }
    
    public Predicate<? super T> getP2() {
    	return this.p2;
    }

    @Override
    public Predicate<T> and(Predicate<? super T> other) {
        return new AndPredicate<T>(this, other);
    }

    @Override
    public Predicate<T> or(Predicate<? super T> other) {
        return new OrPredicate<T>(this, other);
    }

    @Override
    public Predicate<T> negate() {
        return new NegatePredicate<>(this);
    }
}
