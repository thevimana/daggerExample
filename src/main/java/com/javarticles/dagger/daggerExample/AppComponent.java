package com.javarticles.dagger.daggerExample;

import dagger.Component;

@Component(modules= {BarModule.class})
public interface AppComponent {
    Foo foo();
}
