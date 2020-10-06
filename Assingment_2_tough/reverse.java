import java.util.Scanner;
class reverse{
	    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("\n Enter number : ");
        int number = sc.nextInt();
		int change = 0;
        while(number != 0)
		{
			int last = number%10 ;
			    change = change * 10 + last ;
				number = number / 10 ;
		}			
		System.out.println("Reverse number is : "+change);
		
		
		
		
		
		}
		
}