package com.example.holdings.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/example/holdings/data/HoldingsRepositoryContract;", "", "refreshFromNetwork", "Lcom/example/holdings/data/RepoResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamHoldings", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/holdings/data/local/HoldingEntity;", "data_debug"})
public abstract interface HoldingsRepositoryContract {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.holdings.data.local.HoldingEntity>> streamHoldings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.holdings.data.RepoResult<kotlin.Unit>> $completion);
}