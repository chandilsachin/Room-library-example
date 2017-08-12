package com.sachinchandil.room_database_project;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sachinchandil.room_database_project.database.ProjectDao;
import com.sachinchandil.room_database_project.database.ProjectDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProjectDatabase database = Room.databaseBuilder(this, ProjectDatabase.class,
                "projectData").build();
        ProjectDao dao = database.projectDao();
        
    }
}
