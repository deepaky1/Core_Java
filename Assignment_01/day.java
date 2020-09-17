import java.util.Scanner;
class day{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Days :");
		int d = sc.nextInt();
		if( d >= 365){
			
			int y = d/365;
			int r = d%365;
			int m = r/30;
			int w = r%30;
			System.out.print("Year = "+y+" month = "+m+" day = "+w);
			
		}else {
			int r = d/31;
			int m = d%31;
		    System.out.print("Month = "+r+" day = "+m);
		}
	}
}