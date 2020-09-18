import java.util.Scanner;
class table{
	    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("\n Enter number to see table of that number : ");
	    byte g = sc.nextByte();
		for (byte i = 1 ; i<=10; i++ ){
			int r = i * g ;
			System.out.println(g+"  *  "+i+" =  "+r );
			
		}
	
}
	
}
	
	