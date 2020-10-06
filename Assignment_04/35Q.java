/*35.	Create a class MathOperation that has four static methods.add() method that takes two integer numbers as
    parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter
    and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and 
    returns the product. power() method that takes two integer numbers as parameter and returns the power of first
    number to second number. Create another class Demo (main class) that takes the two numbers from the user and 
    calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.*/

import java.util.Scanner;

    class MathOperation{
        private int first;
        private int second;
        static int add(int a,int b){    
          return a+b;    
        }

        static int sub(int a , int b){
            return a-b;
        }

        static int multiply(int a, int b){
            return a*b;
        }
        static long power(int a, int b){


            long result = 1;
            for(int p=b; p!= 0; --p ){
                result *= a;
            }
           return result;
        }
    }

    class Demo{
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          MathOperation a[] = new MathOperation[1];

          int add = 0;
          int sub = 0;
          int mult = 0;
          long pow = 0;
          for(int i =0; i < a.length ; i++){
            System.out.print("Enter the first number :");
             int first = sc.nextInt();
             System.out.print("Enter the second number :");
             int second = sc.nextInt();

              add = MathOperation.add(first,second);
              sub = MathOperation.sub(first,second);
              mult = MathOperation.multiply(first,second);
              pow = MathOperation.power(first,second);
          }       
          System.out.println("\nAddition of number : "+add);
          System.out.println("\nsubtraction of number : "+sub);
          System.out.println("\nMultiplication of number : "+mult);
          System.out.println("\npower of number : "+pow);          

        }
    }