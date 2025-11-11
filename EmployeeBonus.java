
// 🧠 1. Office Attendance Bonus
// Scenario:
// If an employee’s attendance is above 90% and they completed all assigned projects, they get a bonus.
// Task:
// Write a program that takes attendance percentage and 
// project status (True/False) as input and prints whether the employee gets a bonus or not.
class Employee{
  private int attendencePercentage;
  private boolean projectCompleted;
  private double bonus;
  
  Employee (int attendencePercentage,boolean projectCompleted){
    this.attendencePercentage=attendencePercentage;
    this.projectCompleted=projectCompleted;
  }
  
  public void calculateBonus(){
    if(attendencePercentage>=90 && projectCompleted==true){
      bonus=2000;
    }else{
      bonus=0;
    }
  }
  
  public double getBonus(){
    return bonus;
  }
}
class EmployeeBonus{
  public static void main (String[] args) {
    Employee emp=new Employee(92,true);
    emp.calculateBonus();
    System.out.println("Employee Bonus:"+emp.getBonus());
    System.out.println("Successfully Bonus Credited");
  }
}