// 39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes 
      values for all three data members.  
// Create a main method in different class (say ProductDemo) and perform following task:
// a. Accept information for five Product objects from user and store objects in an array
// b. Find pid of product with highest price. 
// c. Create a static method (with array of product’s object as argument) in Product class to calculate and return 
     total amount spent on all products. ( amount spent on single product = price of product * quantity of product )

import java.util.Scanner;

class Product{
    private static int pid ;
    private static float price;
    private static int quantity;

    void Product(int pid,float price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;

    }
    static float  total(Product[] info){
        float sum = 0;
        for(Product detail : info ){
            sum += ((detail.price)*(detail.quantity));
        }
        return sum;
    }
}



public class ProductDemo{
     
    public static int highid(Product[] info)
    {
        int maxpid = info[0].pid;
        int maxprice = info[0].price;
        for(Product pack : info){
            if(pack.price > maxprice){
                maxpid = info.pid;
                maxprice = info.price;
            }
        }return maxpid;
    }

    public static void main(String[] args){
      Scanner scan  = new Scanner(System.in);
      Product[] arr = new Product[5];
      for(int i =0; i < arr.length ; i++)
       {
          System.out.print("Enter the Product Id :");
          int pid = scan.nextInt();
          System.out.print("Enter the Product Price :");
          float price = scan.nextfloat();
          System.out.print("Enter the Product Quantity :");
          int quantity = scan.nextInt();
          Product p = new Product();
          a[i] = p ;
      }
      int highpid = ProductDemo.highid(arr);
      float total1 = Product.total(arr);
      System.out.print("Procduct Id which has high Price  :"+highpid);
      System.out.print("total which  Price  :"+highpid);

    }
}