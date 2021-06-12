package com.alyan.recyclerview_191076;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    List<Student1> StudentList = new ArrayList<>();
    RecyclerView recyclerView;
    AdapterActivity1 AdapterActivity1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentList.add(new Student1("Alyan Quddoos", "191076" , R.drawable.ic_baseline_delete_forever_24, "21"));
        StudentList.add(new Student1("Samia Ahmed","191067",R.drawable.ic_baseline_delete_forever_24,"21"));
        StudentList.add(new Student1("Moin","191118", R.drawable.ic_baseline_delete_forever_24,"19"));
        StudentList.add(new Student1("Waleed Hassan", "191154",R.drawable.ic_baseline_delete_forever_24,"20"));
        StudentList.add(new Student1("Ayesha Ashfaq","191127",R.drawable.ic_baseline_delete_forever_24,"21"));
        StudentList.add(new Student1("Faiq Ahmad","191000", R.drawable.ic_baseline_delete_forever_24,"20"));
        StudentList.add(new Student1("Bilal Malik","191173",R.drawable.ic_baseline_delete_forever_24,"23"));
        StudentList.add(new Student1("Abdullah Qaiser","191110",R.drawable.ic_baseline_delete_forever_24,"18"));
        StudentList.add(new Student1("Sammad Ilyas","181001",R.drawable.ic_baseline_delete_forever_24,"22"));
        StudentList.add(new Student1("Aimen Shahid","191045",R.drawable.ic_baseline_delete_forever_24,"22"));



        AdapterActivity1 = new AdapterActivity1(MainActivity.this, StudentList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(AdapterActivity1);
    }
}