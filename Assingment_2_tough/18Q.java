//18 program to check whether a number is Prime number or not 
import java.util.Scanner;

class prime{
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2 ; i < n/2 ; i++){
            if(n%i == 0) {
                System.out.print(n+" Number is not prime number");
                flag = true ;
                break;
            }
        }
        if(flag == false)
        {
            System.out.print(n+" Number is prime number");

        }
        
    }
}