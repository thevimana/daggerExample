package com.javarticles.dagger.daggerExample;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Bar> provideBarProvider;

  private Provider<Foo> fooProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideBarProvider = FooModule_ProvideBarFactory.create(builder.fooModule);

    this.fooProvider = Foo_Factory.create(provideBarProvider);
  }

  @Override
  public Foo foo() {
    return new Foo(provideBarProvider.get());
  }

  public static final class Builder {
    private FooModule fooModule;

    private Builder() {}

    public AppComponent build() {
      if (fooModule == null) {
        this.fooModule = new FooModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder fooModule(FooModule fooModule) {
      this.fooModule = Preconditions.checkNotNull(fooModule);
      return this;
    }
  }
}
