// 💳 7. Credit Card Offer
// Scenario:
// A user is eligible for a credit card offer if they have salary above ₹50,000 and not already a cardholder.
// Task:
// Use logical operators (and, not) and conditionals to display eligibility.

import java.util.Scanner;
class CreditCardOffer{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Salary: ");
        double salary=sc.nextDouble();
        
        System.out.println("Are u Already cardholder?(true/false): ");
        boolean isCardHolder=sc.nextBoolean();
        
        if(salary>50000.0&&!isCardHolder){
            System.out.println("Elligible for Credit Card Offer");
        }else{
            System.out.println("Sorry Not Elligible");
        }
    }
}