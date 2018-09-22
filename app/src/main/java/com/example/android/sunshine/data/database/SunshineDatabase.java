package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {WeatherEntry.class},version = 1)
public abstract class SunshineDatabase extends RoomDatabase{

    private static final String DATABASE_NAME = "weather";
    private static final Object LOCK = new Object();
    private static SunshineDatabase sInstance;



    public static SunshineDatabase getInstance(Context context) {
        if (sInstance==null){
            synchronized (LOCK){
                if (sInstance==null){
                    sInstance = Room.databaseBuilder(context.getApplicationContext(),SunshineDatabase.class,
                            SunshineDatabase.DATABASE_NAME).build();
                }
            }

        }
        return sInstance;
    }

    public abstract WeatherDao weatherDao();
}
