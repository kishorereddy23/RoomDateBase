package com.kishore.roomdatebase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "userdetails")
public class StudentEntity {
    @ColumnInfo(name = "name")
    String name;
    @PrimaryKey()
    @NonNull
    @ColumnInfo(name = "rollno")
    String rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getRollno() {
        return rollno;
    }

    public void setRollno(@NonNull String rollno) {
        this.rollno = rollno;
    }
}
