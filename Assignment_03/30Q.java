import java.util.Scanner;

class two_D{
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        int total =0;
        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i<arr.length;i++)
         { 
           for(int j =0; j<arr[i].length; j++)
             {
                   System.out.print("Enter the element "+(i+1)+(j+1)+" : ");
                   arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0 ; i<arr.length;i++){
                total += arr[i][i];
            }
            for(int[] a : arr ){
                for(int b : a){
                    System.out.print(b+"  ");
                }
               System.out.println(" ");
    
             }
             System.out.println("\nAddition of Diagonal element is :"+total);
}
}