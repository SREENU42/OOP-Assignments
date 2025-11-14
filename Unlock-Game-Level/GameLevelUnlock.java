// 🎮 10. Game Level Unlock
// Scenario:
// A player can unlock the next level if they completed the previous level and score is above 80.
// Task:
// Write a java program to check whether the player can unlock the next level.


import java.util.Scanner;

class GameLevelUnlock{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Did You Completed Previous Level?(yes/no):");
     String completed=sc.nextLine();
     
     System.out.println("Enter Your Score:");
     int score=sc.nextInt();
     
     if(completed.equalsIgnoreCase("yes")&&score>80){
         System.out.println("You Can Go Next Level..");
     }else{
         System.out.println("You can't Go to next Level");
     }
    }
}