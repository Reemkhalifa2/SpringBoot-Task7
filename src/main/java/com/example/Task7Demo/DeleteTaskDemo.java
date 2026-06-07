package com.example.Task7Demo;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");


        String targetTask = "groceries";
        boolean found =false;
        for(String task : tasks){
            if (task.equalsIgnoreCase(targetTask)){
                tasks.remove(task);
                System.out.println("Task deleted successfully");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Task not found, no deletion performed");
        }
        System.out.println(tasks);
    }



}
