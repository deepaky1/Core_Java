/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer */

import java.util.Scanner;
class MathOperation{

    static int multiply(int a, int b){
        int res = a * b ;
        System.out.println("Multiplication of two integer is : "+res);
        return res;
 }
    static float multiply(float a, float b, float c){
        float res =(float) (a*b*c);
        System.out.println("Multiplication of three float number is : "+res);
        return res;
    }
    static long multiply(long arr[]){
        long res =1;

        for(int i =0; i <arr.length;i++){
           long ref = arr[i];
           res = res * ref;
        }
        System.out.println("Multiplication of Array integer is : "+res);
        return res;

    }
    static double multiply(double a , int b){
        double res = (double)(a*b);
        System.out.println("Multiplication of two number double and integer is : "+res);
        return res;
    }
    
}


class MathOperationDemo{
    public static void main(String[] args){
      MathOperation.multiply(10,20);
      MathOperation.multiply(10.0f,20.3f,30.4f);
      MathOperation.multiply(12.2d,4);
      long[] arr = { 10,20,30,40,50 };
      MathOperation.multiply(arr);

    }
}