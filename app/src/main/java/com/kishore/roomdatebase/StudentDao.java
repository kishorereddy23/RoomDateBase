package com.kishore.roomdatebase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    public void insert(StudentEntity entity);
    @Delete
    public void delete(StudentEntity entity);
    @Update
    public void update(StudentEntity entity);
    @Query("SELECT * FROM userdetails")
    public List<StudentEntity> retrive();

}
