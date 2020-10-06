import java.util.Scanner;

class search{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int flag =0;
		int c;
		System.out.print("Enter the number you want to enter :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i= 0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number you want to search  :");
		int b = sc.nextInt();
		for( c = 0; c < arr.length; c++){
		  if(arr[c] == b)
		  {
			  flag = 1; 
			  break;
		  }else{
			  flag =0;
		  }
		}
		if(flag == 1){
					System.out.print("Enter the number found at :"+(c+1));
        
		}
		else{
					System.out.print("number not found :");

		}
		
		
	}
	
}