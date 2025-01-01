package com.example.final_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static int DB_VERSION = 1;
    private static String DB_NAME = "account_daily.db";
// DBHelper為幫助管理資料庫建立和版本管理的輔助類別。
// 繼承SQLiteOpenHelper，提供建立資料庫、管理連線和更新資料表結構的方法。
    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE account(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Title VARCHAR(20)," +
                "Date VARCHAR(20)," +
                "Money VARCHAR(20))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
