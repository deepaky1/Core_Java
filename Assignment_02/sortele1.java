import java.util.Scanner;
class sortele1
     {
	   public static void main(String[] args)
	    {
		 Scanner sc =new Scanner(System.in);
         int[] a = new int[10];
		 int temp;
         System.out.println("Enter 10 values : ");
         for(int i =0; i<a.length;i++){
			 a[i] = sc.nextInt();
		 }
		 for(int i =0; i<a.length;i++){
			 for(int j = i+1; j<a.length; j++){
				 
				 if( a[i] > a[j]){
					 
					 temp = a[j];
					 a[j] = a[i];
					 a[i] = temp;	 
				    }
			 
			    }
		    }
			System.out.print("\n Array Elements in Descending Order: ");
        for (int i = 0; i < a.length-1; i++) 
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);  
		   
	    }
    }