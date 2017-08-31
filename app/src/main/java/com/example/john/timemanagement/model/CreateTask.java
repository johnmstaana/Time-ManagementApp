package com.example.john.timemanagement.model;

/**
 * Created by John on 7/6/2017.
 */

public class CreateTask
{

    String task_name;
    String task_note;

    public CreateTask(String task_name, String task_note)
    {
        this.task_name = task_name;
        this.task_note = task_note;
    }

    public String getTask_name()
    {
        return task_name;
    }

    public void setTask_name(String task_name)
    {
        this.task_name = task_name;
    }

    public String getTask_note()
    {
        return task_note;
    }

    public void setTask_note(String task_note)
    {
        this.task_note = task_note;
    }
}
