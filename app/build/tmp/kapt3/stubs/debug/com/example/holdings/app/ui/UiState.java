package com.example.holdings.app.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JC\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u000bH\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/example/holdings/app/ui/UiState;", "", "holdings", "", "Lcom/example/holdings/data/local/HoldingEntity;", "summary", "Lcom/example/holdings/app/ui/PortfolioSummary;", "isExpanded", "", "loading", "error", "", "(Ljava/util/List;Lcom/example/holdings/app/ui/PortfolioSummary;ZZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "getHoldings", "()Ljava/util/List;", "()Z", "getLoading", "getSummary", "()Lcom/example/holdings/app/ui/PortfolioSummary;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class UiState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.holdings.data.local.HoldingEntity> holdings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.holdings.app.ui.PortfolioSummary summary = null;
    private final boolean isExpanded = false;
    private final boolean loading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public UiState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.holdings.data.local.HoldingEntity> holdings, @org.jetbrains.annotations.NotNull()
    com.example.holdings.app.ui.PortfolioSummary summary, boolean isExpanded, boolean loading, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.holdings.data.local.HoldingEntity> getHoldings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.app.ui.PortfolioSummary getSummary() {
        return null;
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public UiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.holdings.data.local.HoldingEntity> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.app.ui.PortfolioSummary component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.holdings.app.ui.UiState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.holdings.data.local.HoldingEntity> holdings, @org.jetbrains.annotations.NotNull()
    com.example.holdings.app.ui.PortfolioSummary summary, boolean isExpanded, boolean loading, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}