import java.util.Scanner;
class leap{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("\n Enter the year : ");
	short y = sc.nextShort();
	if(y/4 == 0)
	{
	  if(y/100 == 0)
		  {
			if (y / 400 == 0)
			   {
			     System.out.print("\n Enter year"+y+" is leap year");	
			     }	
		    else{
			 System.out.print("\n Enter year"+y+" is not leap year");
		    }
   		}
	   else{
		   System.out.print("\n Enter year"+y+" is leap year");
	   }	
	}
	else{
		System.out.print("\n Enter year"+y+" is not leap year);
	}
	
}
	
}