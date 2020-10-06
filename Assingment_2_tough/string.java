import java.util.Scanner;
class string{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of the name  you what to enter : ");
    int n = sc.nextInt();
    String arr[] = new String[n];
    for(int i = 0; i < arr.length; i++)
     {
        System.out.print("Enter the " +(i+1)+ " Name : ");
        arr[i] = sc.next();
     }

     for(String e : arr){
        System.out.println("Name "+e);
     } 
}
}