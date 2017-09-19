package com.javarticles.dagger.daggerExample;

import dagger.Component;

@Component(modules= {FooModule.class})
public interface AppComponent {
    Foo foo();
}
