import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeFunction = new CafeUtil();


        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeFunction.getStreakGoal());
  
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",cafeFunction.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> loadMenu = new ArrayList<String>();
        loadMenu.add("drip coffee");
        loadMenu.add("cappuccino");
        loadMenu.add("latte");
        loadMenu.add("mocha");

        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        cafeFunction.displayMenu(menu);
        
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        // Test 4 times
        for (int i = 0; i < 3; i++) {
            cafeFunction.addCustomer(customers);
            System.out.println("\n");
        }
        
}
