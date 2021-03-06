package com.dsh.mydemos.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dsh.mydemos.greendao.model.CarShop;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CAR_SHOP".
*/
public class CarShopDao extends AbstractDao<CarShop, Long> {

    public static final String TABLENAME = "CAR_SHOP";

    /**
     * Properties of entity CarShop.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Num = new Property(1, int.class, "num", false, "NUM");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Price = new Property(3, double.class, "price", false, "PRICE");
        public final static Property ShopId = new Property(4, String.class, "shopId", false, "SHOP_ID");
        public final static Property EntityId = new Property(5, String.class, "entityId", false, "ENTITY_ID");
        public final static Property Position = new Property(6, int.class, "position", false, "POSITION");
        public final static Property Headpic = new Property(7, String.class, "headpic", false, "HEADPIC");
        public final static Property Spec = new Property(8, String.class, "spec", false, "SPEC");
        public final static Property StockCount = new Property(9, String.class, "stockCount", false, "STOCK_COUNT");
    }


    public CarShopDao(DaoConfig config) {
        super(config);
    }
    
    public CarShopDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CAR_SHOP\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NUM\" INTEGER NOT NULL ," + // 1: num
                "\"NAME\" TEXT," + // 2: name
                "\"PRICE\" REAL NOT NULL ," + // 3: price
                "\"SHOP_ID\" TEXT," + // 4: shopId
                "\"ENTITY_ID\" TEXT," + // 5: entityId
                "\"POSITION\" INTEGER NOT NULL ," + // 6: position
                "\"HEADPIC\" TEXT," + // 7: headpic
                "\"SPEC\" TEXT," + // 8: spec
                "\"STOCK_COUNT\" TEXT);"); // 9: stockCount
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CAR_SHOP\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CarShop entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getNum());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
        stmt.bindDouble(4, entity.getPrice());
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(5, shopId);
        }
 
        String entityId = entity.getEntityId();
        if (entityId != null) {
            stmt.bindString(6, entityId);
        }
        stmt.bindLong(7, entity.getPosition());
 
        String headpic = entity.getHeadpic();
        if (headpic != null) {
            stmt.bindString(8, headpic);
        }
 
        String spec = entity.getSpec();
        if (spec != null) {
            stmt.bindString(9, spec);
        }
 
        String stockCount = entity.getStockCount();
        if (stockCount != null) {
            stmt.bindString(10, stockCount);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CarShop entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getNum());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
        stmt.bindDouble(4, entity.getPrice());
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(5, shopId);
        }
 
        String entityId = entity.getEntityId();
        if (entityId != null) {
            stmt.bindString(6, entityId);
        }
        stmt.bindLong(7, entity.getPosition());
 
        String headpic = entity.getHeadpic();
        if (headpic != null) {
            stmt.bindString(8, headpic);
        }
 
        String spec = entity.getSpec();
        if (spec != null) {
            stmt.bindString(9, spec);
        }
 
        String stockCount = entity.getStockCount();
        if (stockCount != null) {
            stmt.bindString(10, stockCount);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CarShop readEntity(Cursor cursor, int offset) {
        CarShop entity = new CarShop( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // num
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.getDouble(offset + 3), // price
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // shopId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // entityId
            cursor.getInt(offset + 6), // position
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // headpic
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // spec
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // stockCount
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CarShop entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNum(cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPrice(cursor.getDouble(offset + 3));
        entity.setShopId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setEntityId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPosition(cursor.getInt(offset + 6));
        entity.setHeadpic(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSpec(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setStockCount(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CarShop entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CarShop entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CarShop entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
