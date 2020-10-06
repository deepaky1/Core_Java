import java.util.Scanner;
class odd_even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers you want to enter : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i<arr.length ;i++){
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i<arr.length ;i++){
			
			if(arr[i] % 2 == 0)
			{
				sum1 = sum1 + arr[i];
			}
			else{
				sum2 = sum2 + arr[i];
			}
		}
		System.out.print("\nSum of all even number in list is :"+sum1+"\n");
		System.out.print("Sum of all odd number in list is :"+sum2+"\n");
	}
}