import java.util.Scanner;
public class ProductArraysOOPEx {

    public static void main(String[] args) {
        
      Product [] order = {
        new Product("Pizza", 100.0F, 1),
        new Product("Fried chicken", 80.0F, 2),
        new Product("Coke", 100.0F, 2),  
      };

      // print the array

      //first way(for loop):

      //for (int i = 0; i < order.length; i++) {
      //  System.out.println(order[i]);
      //}

      //another way(for each):

      //for (Product product : order) {    //  this way is used only for reading data, 
       // System.out.println(product);     // is more simple then usual 'for' loop  but is not such flexible; 
                                        // its read the data in order it was entered;
        
      //}
      

 // ======================================================================================================================================
 
      // how to create an array from data inputed from kb;
      //1. first i need to know how many items the user would buy- this will be the length of my array;
        Scanner in = new Scanner(System.in);
        System.out.println("How many items will you buy?");
        int itemQ = in.nextInt();

        order = new Product[itemQ];
        System.out.println("Please, complete the order data (foodName, foodPrice, foodQuantity)");
        for (int i = 0; i < order.length; i++) {
            System.out.print("Order" + (i+1) + ": ");
            order[i] = new Product(
                in.next(), in.nextFloat(), in.nextInt()
            );
        }

        System.out.println();
        System.out.println("You order: ");
        for (Product product : order) {    //  this way is used only for reading data, 
            System.out.println(product);     // is more simple then usual 'for' loop  but is not such flexible; 
                                            // its read the data in order it was entered;
            
          }

    




    }
}


class Product{

    public String foodName;
    public Float foodPrice;
    public int foodQuantity;

    public Product(String foodName,Float foodPrice,int foodQuantity ){
       this.foodName = foodName;
       this.foodPrice= foodPrice;
       this.foodQuantity= foodQuantity;
    }

    @Override
    public String toString() {
        return "Product [ foodName= " + foodName + ", foodPrice= " + foodPrice + ", foodQuantity= " + foodQuantity + " ]";
    }   

    

}