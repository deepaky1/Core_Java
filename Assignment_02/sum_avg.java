import java.util.Scanner;
class sum_avg {

    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = sc.nextDouble();
			total = total + arr[i];
        }
            
        double average = total / arr.length;
        System.out.print("\tThe sum is: "+total);
        System.out.println("\tThe average is: "+average);
    }
}