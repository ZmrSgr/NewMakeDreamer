package com.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.bean.entity.Chart;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHART".
*/
public class ChartDao extends AbstractDao<Chart, Long> {

    public static final String TABLENAME = "CHART";

    /**
     * Properties of entity Chart.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Cid = new Property(1, String.class, "cid", false, "CID");
        public final static Property Uid = new Property(2, String.class, "uid", false, "UID");
        public final static Property Bid = new Property(3, String.class, "bid", false, "BID");
        public final static Property Temperature = new Property(4, String.class, "temperature", false, "TEMPERATURE");
        public final static Property Time = new Property(5, String.class, "time", false, "TIME");
        public final static Property Date = new Property(6, String.class, "date", false, "DATE");
    };


    public ChartDao(DaoConfig config) {
        super(config);
    }
    
    public ChartDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHART\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CID\" TEXT," + // 1: cid
                "\"UID\" TEXT," + // 2: uid
                "\"BID\" TEXT," + // 3: bid
                "\"TEMPERATURE\" TEXT," + // 4: temperature
                "\"TIME\" TEXT," + // 5: time
                "\"DATE\" TEXT);"); // 6: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHART\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Chart entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cid = entity.getCid();
        if (cid != null) {
            stmt.bindString(2, cid);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }
 
        String bid = entity.getBid();
        if (bid != null) {
            stmt.bindString(4, bid);
        }
 
        String temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindString(5, temperature);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(7, date);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Chart readEntity(Cursor cursor, int offset) {
        Chart entity = new Chart( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // bid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // temperature
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // date
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Chart entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTemperature(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Chart entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Chart entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
