import java.util.Scanner;
class circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Radius");
		float a = sc.nextFloat();
		float area = (float)(3.14 * a * a);
		System.out.println("\t\nArea of circle is = "+area);
		float circum = (float)(2 * 3.14 * a);
		System.out.println("\t\nCircumference of circle is ="+circum);
		
	} 
}