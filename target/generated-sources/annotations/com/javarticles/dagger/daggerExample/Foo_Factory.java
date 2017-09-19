package com.javarticles.dagger.daggerExample;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Foo_Factory implements Factory<Foo> {
  private final Provider<Bar> barProvider;

  public Foo_Factory(Provider<Bar> barProvider) {
    assert barProvider != null;
    this.barProvider = barProvider;
  }

  @Override
  public Foo get() {
    return new Foo(barProvider.get());
  }

  public static Factory<Foo> create(Provider<Bar> barProvider) {
    return new Foo_Factory(barProvider);
  }
}
