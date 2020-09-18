import java.util.Scanner;
class bigger_if{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the first number : ");
		short a = sc.nextShort();
		System.out.print("\n Enter the second number : ");
		short b = sc.nextShort();
		System.out.print("\n Enter the third number : ");
		short c = sc.nextShort();
		if( a > b && a > c){
			
			System.out.print("\n the Greatest number is : "+a);
			
		}else if( a < b && b > c){
			
			System.out.print("\n the Greatest number is : "+b);
			
		}
		else {
			
			System.out.print("\n the Greatest number is : "+c);
		}
		System.out.print("\n");
	}
}