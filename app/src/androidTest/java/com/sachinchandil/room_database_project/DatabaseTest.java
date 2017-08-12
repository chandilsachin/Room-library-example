package com.sachinchandil.room_database_project;

import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.sachinchandil.room_database_project.database.ProjectDao;
import com.sachinchandil.room_database_project.database.ProjectDatabase;
import com.sachinchandil.room_database_project.database.ProjectItem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sachin on 12/8/17.
 */

@RunWith(AndroidJUnit4.class)
public class DatabaseTest {

    private ProjectDao projectDao;
    ProjectDatabase database;
    @Before
    public void setUp(){
        database = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getTargetContext(),
                ProjectDatabase.class).build();

        projectDao = database.projectDao();
    }

    @After
    public void tearDown(){
        database.close();
    }

    @Test
    public void shouldInsertData(){
        ProjectItem item = new ProjectItem();
        item.setSNo(1);
        item.setTitle("Project 1");

        projectDao.insertProject(item);
        ProjectItem item1 = projectDao.getProject(item.getSNo());
        assertEquals(item1.getSNo(), item.getSNo());
    }
}
