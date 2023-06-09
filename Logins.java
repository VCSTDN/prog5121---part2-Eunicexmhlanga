   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creatingkanban;

import java.util.Scanner;

/**
 *
 * @author eunicemhlanga
 */
public class CreatingKanban {

    

    

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to EasyKanban");
        int option=0;
        while (option !=3){
            System.out.println("Menu");
            System.out.println("1. Add tasks");
            System.out.println("2. Show report");
            System.out.println("3. Quit");
            System.out.println("Enter your choice:");
            option=scanner.nextInt();
            switch (option){
                case 1 : 
                    addTask();
                break;
                case 2:
                    showReport();
                    break;
                case 3 : 
                    System.out.println("Quiting the ptogram");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
                    
            }
        }
        scanner.close();
    }
    public static void addTask() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of tasks");
        int numTasks= scanner.nextInt();
        for(int i = 0; i<numTasks; i ++){
        
            
            
        
            scanner.nextLine();
            System.out.println("\nTask"+i);
            System.out.println("Task name:");
            String taskName= scanner.nextLine();
            System.out.println("Task description");
            String taskDescription= scanner.nextLine();
            if(taskDescription.length()<50){
                System.out.println("Task successfully captured");
            }else{
                System.out.println("Please enter a task description of less than 50 characters");
                
            }
            System.out.println("Developer's firts name");
            String firstName = scanner.nextLine();
            System.out.println("Developer's last name");
            String lastName = scanner.nextLine();
            System.out.println("Enter the task duration in hours");
            
            int taskDuration= scanner.nextInt();
            
            
            System.out.println("Task ID :");
            String taskIDStr= createTaskId(taskName, numTasks, lastName );
            System.out.println(taskIDStr);
            System.out.println("Choose the task Status from the staus menu:");
            System.out.println("1.To do");
            System.out.println("2.Done");
            System.out.println("3.Doing");
            int choice= 
                    scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("1.To do");
                    break;
                case 2:
                    System.out.println("Done ");
                    break;
                case 3:
                    System.out.println("Doing");
                    break;
                default:
                    System.out.println("Invalid choice");
                    
                    
                    
            }
                    
            
            
            
            
                
            
            
       
            
        }
    }
    private static String createTaskId(String taskName, int taskNumber, String lastName){
        String taskId= taskName.substring(0,2)+ ":"+ taskNumber + ":"+ lastName.substring(lastName.length()-3);
        return taskId.toUpperCase();
    }
    private static void showReport(){
        System.out.println("Coming soon");
    }
    
}
class Task{
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String firstName;
    private int taskDuration;
    private String taskId;
    
    public Task(String taskName, int taskNumber, 
            String taskDescription, String firstName, String lastName, int taskDuration, String taskId){
        this.taskName=taskName;
        this.taskNumber=taskNumber;
        this.taskDuration= taskDuration;
        this.taskId= taskId;
        
    }
    public boolean validateTaskDescription(){
        return
                taskDescription.length()<=50;
    }
    public String createTaskId(){
        return taskId;
    }
    public String printTaskDetails()
    {
        {
    return

      