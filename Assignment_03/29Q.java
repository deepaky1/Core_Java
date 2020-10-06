//29.	Write a program to print the total number of one-D arrays in a two-D array and
  // the number of elements in every one-D array present in the two-D arrays.


  class Array{
    public static void main(String[] args){
        int[][] arr = { {10,20,30},{40,50,60},
                         {70,80,90,100},{110,120,130,140},
                         {150,160,170}  };

        for(int i =0 ; i<arr.length;i++){
            for(int j =0; j<arr[i].length; j++){
                   System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("total number of 1-D Array : "+arr.length);
   
        for(int i =0 ; i<arr.length;i++){
            int count =0;
         System.out.print("Row "+(i+1)+"  Size is : ");
         for(int j =0 ; j<arr[i].length;j++){
           count++;
        }
        System.out.println(count);
         
    }
    }
}