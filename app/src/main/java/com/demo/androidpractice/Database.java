package com.demo.androidpractice;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Point;

import java.util.List;

/**
 * Created by DELL on 19-Feb-16.
 */
public class Database extends SQLiteOpenHelper {

    public Database(Context context) {
        super(context, "notes.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      String sql="create table POINTS (ID INTEGER PRIMARY KEY, X INTEGER NOT NULL, Y INTEGER NOT NULL)";
      db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void storePoints(List<Point> points){

          SQLiteDatabase db = getWritableDatabase();
          db.delete("POINTS",null,null);
          int i=0;

          for(Point point:points){
                 ContentValues contentValues=new ContentValues();
//                 contentValues.put();
  //               db.insert();



          }


         ContentValues contentValues=new ContentValues();


    }
}
