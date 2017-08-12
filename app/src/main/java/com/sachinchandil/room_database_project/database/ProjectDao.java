package com.sachinchandil.room_database_project.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sachin on 12/8/17.
 */
@Dao
public interface ProjectDao {

    @Insert
    void insertProjects(List<ProjectItem> projectItems);

    @Insert
    void insertProject(ProjectItem projectItem);

    @Query("SELECT * FROM Projects")
    List<ProjectItem> getProjects();

    @Query("SELECT * FROM Projects WHERE s_no = :sNo")
    ProjectItem getProject(int sNo);

}
