//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

class Array{
    public static void main(String[] args){
        int[][] arr = { {10,20,30},{40,50,60},
                         {70,80,90,100},{110,120,130,140},
                         {150,160,170}  };
        int sum = 0;

         
        // for(int i =0 ; i<arr.length;i++){
        //     for(int j =0; j<arr[i].length; j++){
        //            System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }


        for(int[] a : arr ){
            for(int b : a){
                System.out.print(b+"  ");
            }
           System.out.println(" ");

         }
         
         for(int i =0 ; i<arr.length;i++){
             for(int j =0; j<arr[i].length; j++){
                 sum += arr[i][j];
             }
         }
         System.out.println("\ntotal is : "+sum);

    }

} 