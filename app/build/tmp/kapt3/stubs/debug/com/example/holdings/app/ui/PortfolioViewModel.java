package com.example.holdings.app.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/holdings/app/ui/PortfolioViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/holdings/data/HoldingsRepositoryContract;", "(Lcom/example/holdings/data/HoldingsRepositoryContract;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/holdings/app/ui/UiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "refresh", "", "toggleExpanded", "Companion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PortfolioViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.holdings.data.HoldingsRepositoryContract repo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.holdings.app.ui.UiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.holdings.app.ui.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.holdings.app.ui.PortfolioViewModel.Companion Companion = null;
    
    @javax.inject.Inject()
    public PortfolioViewModel(@org.jetbrains.annotations.NotNull()
    com.example.holdings.data.HoldingsRepositoryContract repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.holdings.app.ui.UiState> getUiState() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final void toggleExpanded() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/holdings/app/ui/PortfolioViewModel$Companion;", "", "()V", "calculateSummary", "Lcom/example/holdings/app/ui/PortfolioSummary;", "holdings", "", "Lcom/example/holdings/data/local/HoldingEntity;", "format", "", "amount", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.holdings.app.ui.PortfolioSummary calculateSummary(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.holdings.data.local.HoldingEntity> holdings) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String format(double amount) {
            return null;
        }
    }
}