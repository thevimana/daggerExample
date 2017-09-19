package com.javarticles.dagger.daggerExample;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FooModule_ProvideBarFactory implements Factory<Bar> {
  private final FooModule module;

  public FooModule_ProvideBarFactory(FooModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Bar get() {
    return Preconditions.checkNotNull(
        module.provideBar(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Bar> create(FooModule module) {
    return new FooModule_ProvideBarFactory(module);
  }

  /** Proxies {@link FooModule#provideBar()}. */
  public static Bar proxyProvideBar(FooModule instance) {
    return instance.provideBar();
  }
}
