import java.util.Scanner;
class temperature{
   public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter temp in feranhite : ");
	float f = sc.nextFloat();
	float c = (float)( 5 * (( f - 32) / 9));
	System.out.print("\n\t temp in feranhite : "+f+"\t temp in celsius = "+c+" *C");
}
}