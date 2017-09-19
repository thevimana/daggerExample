package com.javarticles.dagger.daggerExample;

import javax.inject.Inject;

public class Foo {
    private Bar bar;

    @Inject
    public Foo(Bar bar) {
        this.bar = bar;
    }

    Bar getBar() {
        return bar;
    }
    
    @Override
    public String toString() {
        return "Foo (" + bar + ")";
    }
}
