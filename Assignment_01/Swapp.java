import java.util.Scanner;
class Swapp{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		System.out.print("Before Swapping First Number : "+a+" and Second number "+b);
		b = a + b;
		a = b - a;
		b = b - a;
		
		System.out.print("\n\nAfter Swapping First Number : "+a+" and Second number "+b);
 }
}