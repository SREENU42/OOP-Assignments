// 🛒 2. Shopping Discount Eligibility
// Scenario:
// A customer gets a discount if their purchase amount is above ₹5000 or they are a premium member.
// Task:
// Use logical operators (and, or) and conditional statements to check discount eligibility.

class Discount{
  private double purchasedAmount;
  private boolean premiumMember;
  private double discount;
  
  Discount(double purchasedAmount,boolean premiumMember){
    this.purchasedAmount=purchasedAmount;
    this.premiumMember=premiumMember;
  }
  public void calculateDiscount(){
    if(purchasedAmount>=5000.0||premiumMember){
      discount=1000.0;
    }else{
      discount=0.0;
    }
  }
  
  public double getDiscount(){
    return discount;
  }
}

class DiscountElligibility{
  public static void main (String[] args) {
    Discount dis=new Discount(9000.0,true);
    
    dis.calculateDiscount();
    System.out.println("Discount Amount:"+dis.getDiscount());
  }
}