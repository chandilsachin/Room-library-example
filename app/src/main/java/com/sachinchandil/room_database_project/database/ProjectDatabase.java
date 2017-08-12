package com.sachinchandil.room_database_project.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by sachin on 12/8/17.
 */
@Database(entities = {ProjectItem.class}, version = 1, exportSchema = false)
public abstract class ProjectDatabase extends RoomDatabase {

    public abstract ProjectDao projectDao();

}
