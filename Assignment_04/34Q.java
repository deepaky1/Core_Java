/*34.	Create a class Circle that has two data members, 
        one to store the radius and another to store area and three methods 
        first init() method to input radius from user, second calculateArea() 
        method to calculate area of circle and third 
        display() method to display values of radius and area. 
        Create class CircleDemo ( main class) that creates the Circle object and calls
        init(), calculateArea() and display() methods.*/
import java.util.Scanner;
class circle{
    private float radius;
    private float area;
    float init(float radius){
        this.radius = radius;
         return radius;
    }
    float calculate_area(float radius){
            this.area =(float) (3.14 * radius * radius);
            return area;
    }
    void display(){
                    System.out.print("Given radius is : "+radius+"\t Area of that circle is :"+area+"unitsquare");
    }
}
class CircleDemo{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      circle c = new circle();
      System.out.print("Enter the radius : ");
     float n = sc.nextFloat();
     float a = c.init(n);
      c.calculate_area(a);
      c.display();

        
    }
}