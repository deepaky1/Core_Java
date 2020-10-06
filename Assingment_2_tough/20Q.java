//20 print all prime number betwwen two given number

import java.util.Scanner;

class prime_between{
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from start :");
        int f = sc.nextInt();
        System.out.print("Enter the number at end :");
        int e = sc.nextInt();
     
        for(; f <= e ; f++)
          {             
            if(f == 0 || f == 1 ) 
               continue;
                 boolean flag = true;
                 for(int i=2 ; i < f/2 ; i++)
                   {
                     if (f % i ==0)
                       {
                         flag = false ;
                         break;
                        }
                    }
        if(flag == true)
        {
            System.out.print(f+" ");

        }
    }
    }
}