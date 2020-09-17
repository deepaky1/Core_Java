import java.util.Scanner;
class Percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks\n");
		
		System.out.println("Marks in CPP :");
		    float a = sc.nextFloat();
		System.out.println("Marks in DS  :");
			float b = sc.nextFloat();
		System.out.println("Marks in DB  :");
			float c = sc.nextFloat();
		System.out.println("Marks In AWP  :");
			float d = sc.nextFloat();
		System.out.println("Marks in MEAN :");
			float e = sc.nextFloat();
		
        float sum =	(a + b + c + d + e);	
		float avg = (float)((a + b + c + d + e)/5);	
		System.out.println("\n\n Sum = "+sum+"\t\tPercentage Marks = "+avg+"%");
		
	}
}