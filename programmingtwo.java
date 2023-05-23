/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;



public class programmingtwo {
    

    private static String TaskName;
    private static int  TaskNumber;
    private static String TaskDescription;
    private static String DeveloperDetails;
    private static int  TaskDuration;
    private static String TaskID;
    private static String TaskStatus;
    private static int taskcount;
    private static int task;
     private static int  option; 
     private static int progress;
      
      
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Welcome();
        AddTask();
        TotalHours();
    }
    public static  void Welcome(){

        
    option=Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban" + "\nSelect from the options below"+"\n1"+" "+"Add a task"+"\n2"+" "+"Show report"+"\n3"+" "+"Quit" ));

        
        
    }
    public static void AddTask(){
        switch(option){
       case 1:
            taskcount =Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks do you wish to record:"));
            for(int i = 0;i < taskcount; i ++ ) {//for task count is less tne number of tasks
            
                
                TaskName =(JOptionPane.showInputDialog(null,"Task Name:"));
                
                for(int f = 0;f < taskcount;f++) {
                     TaskNumber = i + 1;
                     JOptionPane.showMessageDialog(null,TaskNumber);
                }
               
                TaskDescription =(JOptionPane.showInputDialog(null,"Task Description:"));
                checkTaskDescription();
                DeveloperDetails =(JOptionPane.showInputDialog(null,"Developer Details(Full Name):"));
                TaskDuration =Integer.parseInt(JOptionPane.showInputDialog(null,"Task Duration (in-hours):"));
                createTaskID();
                progress=Integer.parseInt(JOptionPane.showInputDialog("Select from the options below"+"\n1 To Do"+"\n2 Done"+"\n3 Doing"));
                switch(progress){
                    case 1:
                     JOptionPane.showMessageDialog(null,"To Do");
                     break;
                    case 2:
                     JOptionPane.showMessageDialog(null,"Done");
                     break;
                    case 3:
                     JOptionPane.showMessageDialog(null,"Doing");
                }
                
                  printTaskDetails();
            }
                     break;
            
        case 2:
            JOptionPane.showMessageDialog(null,"Coming soon");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Quit");
            break;
        default:
            JOptionPane.showMessageDialog(null,"Invalid response");
        
            }
}
    public static boolean checkTaskDescription(){
        
        if (TaskDescription.length() < 50)
        JOptionPane.showMessageDialog(null,"Task successfully captured");
      else
        JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
        return true;
        
    }
    public static String createTaskID(){
        
         String ID = TaskName;

           String[] part = ID.split("\\s"); // array to get each word by itself   
    
    for(int id = 0; id < part.length; id++){
        char l = part[id].charAt(0);//get first letter, first value of array is 0
        String L = String.valueOf(l).toUpperCase();//convert to upper case
  
 
    
    
  String Developer = DeveloperDetails;//last 3 Capital letters
  String J = DeveloperDetails.substring(DeveloperDetails.length()-3);

        JOptionPane.showMessageDialog(null,"TaskID:\n" + L + ":" + TaskNumber + ":" + J.toUpperCase());
        return " ";
        
    }
        return " ";
    
}
    public static String printTaskDetails(){
        String ID = TaskName;

           String[] part = ID.split("\\s"); // array to get each word by itself   
    
    for(int id = 0; id < part.length; id++){
        char l = part[id].charAt(0);//get first letter, first value of array is 0
        String L = String.valueOf(l).toUpperCase();//convert to upper case
  
 
    
    
  String Developer = DeveloperDetails;//last 3 Capital letters
  String J = DeveloperDetails.substring(DeveloperDetails.length()-3);

    
   String K =  L + ":" + TaskNumber + ":" + J.toUpperCase();
    JOptionPane.showMessageDialog(null,"\nTask Status:  " + progress + "\nDeveloper Details:  " + DeveloperDetails+ "\nTask Number:  " + taskcount + "\nTask Name:  " + TaskName + "\nTask Description:  " + TaskDescription  + "\nTaskID:  " + K + "\nTask Duration:  " + TaskDuration);
        return " ";
    
}
        return null;
}
    public static int TotalHours(){
       
         JOptionPane.showMessageDialog(null,TaskDuration);
        return 0;
    }
}
