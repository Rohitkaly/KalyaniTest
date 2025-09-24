package com.example.holdings.data.di;

import com.example.holdings.data.local.AppDatabase;
import com.example.holdings.data.local.HoldingDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
    "KotlinInternalInJava"
})
public final class DataModule_ProvideDaoFactory implements Factory<HoldingDao> {
  private final Provider<AppDatabase> dbProvider;

  public DataModule_ProvideDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public HoldingDao get() {
    return provideDao(dbProvider.get());
  }

  public static DataModule_ProvideDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new DataModule_ProvideDaoFactory(dbProvider);
  }

  public static HoldingDao provideDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideDao(db));
  }
}
