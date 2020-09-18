import java.util.Scanner;
class gross_salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Your Basic Salary :");
		int basic = sc.nextInt();
		if(basic < 10000)
		{
			float hra = (float)( basic * 0.1);
			float da =  (float)( basic * 0.9);
			float gs =  (float)( hra + da + basic );
			System.out.print("\n\tYour Basic is : "+basic);
			System.out.print("\n\n\tYour Gross salary is : "+gs);
		
		}   else if( basic >= 10000)
		  {
			float hra = (float)( basic * 0.2);
			float da =  (float)( basic * 0.98);
			float gs =  (float)( hra + da + basic );
			System.out.print("\n\tYour Basic is : "+basic);
			System.out.print("\n\n\tYour Gross salary is : "+gs);
		 }
	}
}