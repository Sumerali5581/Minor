package com.example.medlife.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.medlife.model.App;
import com.example.medlife.params.Params;

public class MyDbHandler extends SQLiteOpenHelper
{
    public MyDbHandler(Context context)
    {
        super(context, Params.DB_NAME,null,Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create="CREATE TABLE "+ Params.TABLE_NAME+"("+ Params.KEY_USERNAME+"TEXT PRIMARY KEY,"+ Params.KEY_NAME+"TEXT,"
                + Params.KEY_AGE+"INTEGER,"+ Params.KEY_CITY+"TEXT,"+ Params.KEY_PHONE+"TEXT,"+ Params.KEY_PASS+"TEXT"+")";
        Log.d("db","Query being run is:"+create);
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {

    }
    public void addUser(App app)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Params.KEY_USERNAME,app.getUsername());
        values.put(Params.KEY_NAME,app.getName());
        values.put(Params.KEY_AGE,app.getAge());
        values.put(Params.KEY_CITY,app.getCity());
        values.put(Params.KEY_PHONE,app.getPhone());
        values.put(Params.KEY_PASS,app.getPass());

        db.insert(Params.TABLE_NAME,null,values);
        Log.d("db","Successfully inserted");
        db.close();
    }
}
