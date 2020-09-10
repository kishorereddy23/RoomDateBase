package com.kishore.roomdatebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.TextView;

import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.StudentViewHolder> {
    Context studentctx;
    List<StudentEntity>list;

    public MyAdapter(Context studentctx, List<StudentEntity> list) {
        this.studentctx = studentctx;
        this.list = list;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(studentctx)
                .inflate(R.layout.every_row,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.rollno.setText(list.get(position).getRollno());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView edit,name,rollno,delete;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            edit=itemView.findViewById(R.id.text_edit);
            name=itemView.findViewById(R.id.text_username);
            rollno=itemView.findViewById(R.id.text_delete);
            delete=itemView.findViewById(R.id.text_delete);

        }
    }
}
