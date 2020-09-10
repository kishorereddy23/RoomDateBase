package com.kishore.roomdatebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    StudentDatabase database;
    StudentEntity entity;
    List<StudentEntity> entityList;
    RecyclerView recycler;
    EditText username,rollno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.text_username);
        rollno=findViewById(R.id.text_rollno);
        recycler=findViewById(R.id.recycler_view);
        database= Room.databaseBuilder(this,StudentDatabase.class,"name").allowMainThreadQueries().build();
    }

    public void saveData(View view) {
        String uname=username.getText().toString();
        String uroll=rollno.getText().toString();
        entity=new StudentEntity();
        entity.setName(uname);
        entity.setRollno(uroll);
        database.studentDao().insert(entity);
        Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();
    }

    public void retriveData(View view) {
        entityList=database.studentDao().retrive();
        adapter=new MyAdapter(this,entityList);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }
}