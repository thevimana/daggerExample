package com.javarticles.dagger.daggerExample;

import dagger.Module;
import dagger.Provides;

@Module
public class FooModule {
    @Provides Bar provideBar() {
        return new Bar();
    }
}
