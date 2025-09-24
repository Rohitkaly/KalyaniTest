package com.example.holdings.data.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HoldingDao_Impl implements HoldingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HoldingEntity> __insertionAdapterOfHoldingEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public HoldingDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHoldingEntity = new EntityInsertionAdapter<HoldingEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `holdings` (`symbol`,`quantity`,`avgPrice`,`ltp`,`close`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final HoldingEntity entity) {
        if (entity.getSymbol() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getSymbol());
        }
        statement.bindLong(2, entity.getQuantity());
        statement.bindDouble(3, entity.getAvgPrice());
        statement.bindDouble(4, entity.getLtp());
        statement.bindDouble(5, entity.getClose());
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM holdings";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<HoldingEntity> items, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHoldingEntity.insert(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Flow<List<HoldingEntity>> getAll() {
    final String _sql = "SELECT * FROM holdings";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"holdings"}, new Callable<List<HoldingEntity>>() {
      @Override
      @NonNull
      public List<HoldingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfAvgPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "avgPrice");
          final int _cursorIndexOfLtp = CursorUtil.getColumnIndexOrThrow(_cursor, "ltp");
          final int _cursorIndexOfClose = CursorUtil.getColumnIndexOrThrow(_cursor, "close");
          final List<HoldingEntity> _result = new ArrayList<HoldingEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final HoldingEntity _item;
            final String _tmpSymbol;
            if (_cursor.isNull(_cursorIndexOfSymbol)) {
              _tmpSymbol = null;
            } else {
              _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
            }
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpAvgPrice;
            _tmpAvgPrice = _cursor.getDouble(_cursorIndexOfAvgPrice);
            final double _tmpLtp;
            _tmpLtp = _cursor.getDouble(_cursorIndexOfLtp);
            final double _tmpClose;
            _tmpClose = _cursor.getDouble(_cursorIndexOfClose);
            _item = new HoldingEntity(_tmpSymbol,_tmpQuantity,_tmpAvgPrice,_tmpLtp,_tmpClose);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
