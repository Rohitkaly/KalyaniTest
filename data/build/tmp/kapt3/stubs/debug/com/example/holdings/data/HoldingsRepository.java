package com.example.holdings.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/holdings/data/HoldingsRepository;", "Lcom/example/holdings/data/HoldingsRepositoryContract;", "api", "Lcom/example/holdings/data/remote/HoldingsApi;", "dao", "Lcom/example/holdings/data/local/HoldingDao;", "(Lcom/example/holdings/data/remote/HoldingsApi;Lcom/example/holdings/data/local/HoldingDao;)V", "dtoToEntity", "Lcom/example/holdings/data/local/HoldingEntity;", "d", "Lcom/example/holdings/data/model/HoldingDto;", "refreshFromNetwork", "Lcom/example/holdings/data/RepoResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamHoldings", "Lkotlinx/coroutines/flow/Flow;", "", "data_debug"})
public final class HoldingsRepository implements com.example.holdings.data.HoldingsRepositoryContract {
    @org.jetbrains.annotations.NotNull()
    private final com.example.holdings.data.remote.HoldingsApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.holdings.data.local.HoldingDao dao = null;
    
    public HoldingsRepository(@org.jetbrains.annotations.NotNull()
    com.example.holdings.data.remote.HoldingsApi api, @org.jetbrains.annotations.NotNull()
    com.example.holdings.data.local.HoldingDao dao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.holdings.data.local.HoldingEntity>> streamHoldings() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object refreshFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.holdings.data.RepoResult<kotlin.Unit>> $completion) {
        return null;
    }
    
    private final com.example.holdings.data.local.HoldingEntity dtoToEntity(com.example.holdings.data.model.HoldingDto d) {
        return null;
    }
}