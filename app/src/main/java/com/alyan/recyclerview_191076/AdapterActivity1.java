package com.alyan.recyclerview_191076;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import com.alyan.recyclerview_191076.Student1;

public class AdapterActivity1  extends RecyclerView.Adapter<AdapterActivity1.ViewHolder> {
    private Context context;
    private List<Student1> StudentList;
    public AdapterActivity1() {

    }

    public AdapterActivity1(Context context, List<Student1> studentList) {
        this.context = context;
        StudentList = studentList;
    }

    @NonNull
    @Override
    public AdapterActivity1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterActivity1.ViewHolder holder, int position) {
        Student1 student = StudentList.get(position);
        holder.tv_user.setText(student.getUser());
        holder.tv_rollno.setText(student.getRollNo());
        holder.tv_age.setText(student.getAge());
        holder.img_del.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                StudentList.remove(position);
                notifyDataSetChanged();
            }
        });




    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tv_user,tv_rollno,tv_age;
        ImageButton img_del;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_user = itemView.findViewById(R.id.txt_user);
            tv_rollno= itemView.findViewById(R.id.txt_rollno);
            img_del=itemView.findViewById(R.id.img_delete);
            tv_age=itemView.findViewById(R.id.txt_age);
        }

        @Override
        public void onClick(View v) {

        }
    }
}