import java.util.Scanner;
class marriage{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("\n Enter gender male for 'm' and for  female  'f' : ");
	char g = sc.next().charAt(0);
    System.out.print("\n Enter your age : ");
	int a = sc.nextInt();
    if( g == 'f' && a >= 18)
	   {
         System.out.print("\n\t\t Congratulations you are eligible for marriage :)" );
        }
	 if( g == 'm' && a >= 21)
	   {
         System.out.print("\n\t\t Congratulations you are eligible for marriage :)" );
        }
	    else{
		   System.out.print("\n\t\t you are not eligible for marriage " );
	      }
	
	}
}