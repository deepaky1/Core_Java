import java.util.Scanner;
class ternery{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the first number : ");
		short a = sc.nextShort();
		System.out.print("\n Enter the second number : ");
		short b = sc.nextShort();
		System.out.print("\n Enter the third number : ");
		short c = sc.nextShort();	
		short d = (a > b) ? ( a > c ? a : c): ( b > c ? b : c);
	//	short e = (c > d) ? c : d;
		System.out.print("\n the Greatest number is : "+d);
		
	}
}