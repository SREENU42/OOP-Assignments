// 🍔 6. Restaurant Order Check
// Scenario:
// If the ordered item exists in the menu list, print “Available”, else “Not Available”.
// Task:
// Use the in operator to check for item availability.
import java.util.*;
class Restaurant{
    private List<String> menuItems;
    
    Restaurant(){
        menuItems=new ArrayList<>();
        menuItems.add("Burger");
        menuItems.add("Pizza");
        menuItems.add("Pasta");
        menuItems.add("Sandwich");
        menuItems.add("Fries");
    }
    
    public void checkItem(String orderedItem){
        if(menuItems.contains(orderedItem)){
            System.out.println(orderedItem+" is Available");
        }else{
            System.out.println(orderedItem+"is not Available");
        }
    }
    public void showMenu(){
        System.out.println("Menu:"+menuItems);
    }
}
public class RestaurantOrderCheck{
    public static void main (String[] args) {
        Restaurant r=new Restaurant();
        r.showMenu();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the order please: ");
        String item=sc.nextLine();
        
        r.checkItem(item);
    }
}