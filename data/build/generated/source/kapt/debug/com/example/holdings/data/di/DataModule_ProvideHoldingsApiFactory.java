package com.example.holdings.data.di;

import com.example.holdings.data.remote.HoldingsApi;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class DataModule_ProvideHoldingsApiFactory implements Factory<HoldingsApi> {
  private final Provider<Moshi> moshiProvider;

  private final Provider<OkHttpClient> okProvider;

  public DataModule_ProvideHoldingsApiFactory(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> okProvider) {
    this.moshiProvider = moshiProvider;
    this.okProvider = okProvider;
  }

  @Override
  public HoldingsApi get() {
    return provideHoldingsApi(moshiProvider.get(), okProvider.get());
  }

  public static DataModule_ProvideHoldingsApiFactory create(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> okProvider) {
    return new DataModule_ProvideHoldingsApiFactory(moshiProvider, okProvider);
  }

  public static HoldingsApi provideHoldingsApi(Moshi moshi, OkHttpClient ok) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideHoldingsApi(moshi, ok));
  }
}
