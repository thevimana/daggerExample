package com.javarticles.dagger.daggerExample;

import dagger.Module;
import dagger.Provides;

@Module
public class BarModule {
    @Provides Bar provideBar() {
        return new Bar();
    }
}
