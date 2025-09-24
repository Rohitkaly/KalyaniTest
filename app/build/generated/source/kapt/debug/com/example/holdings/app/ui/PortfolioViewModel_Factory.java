package com.example.holdings.app.ui;

import com.example.holdings.data.HoldingsRepositoryContract;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class PortfolioViewModel_Factory implements Factory<PortfolioViewModel> {
  private final Provider<HoldingsRepositoryContract> repoProvider;

  public PortfolioViewModel_Factory(Provider<HoldingsRepositoryContract> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public PortfolioViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static PortfolioViewModel_Factory create(
      Provider<HoldingsRepositoryContract> repoProvider) {
    return new PortfolioViewModel_Factory(repoProvider);
  }

  public static PortfolioViewModel newInstance(HoldingsRepositoryContract repo) {
    return new PortfolioViewModel(repo);
  }
}
