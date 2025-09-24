package com.example.holdings.data.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/holdings/data/di/DataModule;", "", "()V", "provideDao", "Lcom/example/holdings/data/local/HoldingDao;", "db", "Lcom/example/holdings/data/local/AppDatabase;", "provideDb", "context", "Landroid/content/Context;", "provideHoldingsApi", "Lcom/example/holdings/data/remote/HoldingsApi;", "moshi", "Lcom/squareup/moshi/Moshi;", "ok", "Lokhttp3/OkHttpClient;", "provideMoshi", "provideOkHttp", "provideRepository", "Lcom/example/holdings/data/HoldingsRepositoryContract;", "api", "dao", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.holdings.data.di.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.data.remote.HoldingsApi provideHoldingsApi(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient ok) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.data.local.AppDatabase provideDb(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.data.local.HoldingDao provideDao(@org.jetbrains.annotations.NotNull()
    com.example.holdings.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.data.HoldingsRepositoryContract provideRepository(@org.jetbrains.annotations.NotNull()
    com.example.holdings.data.remote.HoldingsApi api, @org.jetbrains.annotations.NotNull()
    com.example.holdings.data.local.HoldingDao dao) {
        return null;
    }
}