package com.example.holdings.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u0096@\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/holdings/data/FakeApi;", "Lcom/example/holdings/data/remote/HoldingsApi;", "resp", "Lcom/example/holdings/data/model/HoldingsResponse;", "(Lcom/example/holdings/data/model/HoldingsResponse;)V", "getHoldings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debugUnitTest"})
public final class FakeApi implements com.example.holdings.data.remote.HoldingsApi {
    @org.jetbrains.annotations.NotNull()
    private final com.example.holdings.data.model.HoldingsResponse resp = null;
    
    public FakeApi(@org.jetbrains.annotations.NotNull()
    com.example.holdings.data.model.HoldingsResponse resp) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getHoldings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.holdings.data.model.HoldingsResponse> $completion) {
        return null;
    }
}