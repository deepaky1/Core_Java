import java.util.Scanner;

class reverse_array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to enter :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] b = new int[n];
   		
		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
			System.out.println("Before Reverse :\n");
		for(int c : arr){
			System.out.print(c+" ");
		}
		
	    for(int i = n-1,j=0; i >= 0 ; i--,j++){
		  b[j] = arr[i];
		}
		
			System.out.println("\nAfter Reverse :\n");
		for(int e : b){
			System.out.print(e+" ");
		}
		
		
	}
}