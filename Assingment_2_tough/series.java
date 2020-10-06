import java.util.Scanner;
class series{
	    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("\n Enter number : ");
        int n = sc.nextInt();
		int a; 
		int b = 0;
		for ( int i = 1 ; i <= n ;i++){
			
			 a = i*i;
			 b = b + a;
			 System.out.println(i+"^2 = "+a);
			}
		System.out.println("\n\tSum = "+b);
		
		}
}