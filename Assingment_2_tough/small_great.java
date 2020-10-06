import java.util.Scanner;
class small_great{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number you what to enter : ");
    int n = sc.nextInt();
    int grt = 0;
    int sm =0;
    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++)
     {
        System.out.print("Enter the " +i+ " value : ");
        arr[i] = sc.nextInt();
     }

     for(int i = 0; i < arr.length-1; i++){
        grt = arr[i];
        sm = arr[i];
        if( grt <= arr[i+1] )
         {
           grt = arr[i+1];
         }
        else if( sm >= arr[i+1])
         {
             sm = arr[i+1];
         }

    }
    System.out.println("Greatest number: "+grt);
    System.out.println("Smallest number: "+sm);
 
}
}