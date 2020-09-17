import java.util.Scanner;
class simple_interest{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Principle Amount = ");
	int p = sc.nextInt();
	System.out.print("\nEnter Rate Of interest = ");
	float i = sc.nextFloat();
    System.out.print("\nEnter No of year = ");
	int y = sc.nextInt();
	float SI = (float)(( p * i * y) * (0.01) );
	System.out.print("\n\tSimple interest is = "+SI);
}
}