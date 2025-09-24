package com.example.holdings.data.di;

import com.example.holdings.data.HoldingsRepositoryContract;
import com.example.holdings.data.local.HoldingDao;
import com.example.holdings.data.remote.HoldingsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
    "KotlinInternalInJava"
})
public final class DataModule_ProvideRepositoryFactory implements Factory<HoldingsRepositoryContract> {
  private final Provider<HoldingsApi> apiProvider;

  private final Provider<HoldingDao> daoProvider;

  public DataModule_ProvideRepositoryFactory(Provider<HoldingsApi> apiProvider,
      Provider<HoldingDao> daoProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public HoldingsRepositoryContract get() {
    return provideRepository(apiProvider.get(), daoProvider.get());
  }

  public static DataModule_ProvideRepositoryFactory create(Provider<HoldingsApi> apiProvider,
      Provider<HoldingDao> daoProvider) {
    return new DataModule_ProvideRepositoryFactory(apiProvider, daoProvider);
  }

  public static HoldingsRepositoryContract provideRepository(HoldingsApi api, HoldingDao dao) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideRepository(api, dao));
  }
}
