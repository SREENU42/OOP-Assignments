// ⚡ 8. Electricity Bill Discount
// Scenario:
// Customers get a 10% discount if usage is below 100 units or they are senior citizens.
// Task:
// Take user inputs and calculate the bill after applying logical conditions.

import java.util.Scanner;


class ElectricityBillDiscount{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Electricity Bill Amount:");
        double bill=sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter Units Consumed:");
        int units=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Your Are A Senior Citizen?yes/No: ");
        String senior=sc.nextLine();
        
        double discount=0;
        if(units<100||senior.equalsIgnoreCase("yes")){
            discount =bill*0.10;
        }
        double finalBill=bill-discount;
        
        System.out.println("------Bill Summary----------");
        System.out.println("Original Bill:"+bill);
        System.out.println("Discount:"+discount);
        System.out.println("Final Bill:"+finalBill);
    }
}