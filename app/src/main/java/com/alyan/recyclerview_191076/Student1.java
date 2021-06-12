package com.alyan.recyclerview_191076;

import android.graphics.drawable.Icon;

public class Student1
{
    String user;
    String rollno,age;
    int Delete;

    public Student1()
    {

    }

    public Student1( String User, String rollNo, int delete, String Age)
    {
        user = User;
        this.rollno = rollNo;
        Delete = delete;
        age = Age;
    }

    public void setUser(String User)
    {
        user = User;
    }

    public void setRollNo(String rollNo)
    {
        rollno = rollNo;
    }

    public void setDelete(int delete)
    {
        Delete = delete;
    }

    public void setAge(String Age)
    {
        age = Age;
    }

    public String getUser() {
        return user;
    }

    public String getRollNo() {
        return rollno;
    }

    public int getDelete() { return Delete; }

    public String getAge() { return age; }
};