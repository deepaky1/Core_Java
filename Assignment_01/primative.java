class primative{
	public static void main(String[] args){
		int x = 3;
		int y;
		int z;
		y = (x * x) + 3*x -7;
		System.out.println("\nA--> Value of Y = "+y);
		y =( x++) + (++x );
		System.out.println("\nB--->Value of X is "+x+" and "+"Value of Y is "+y);
		z = x++ - --y - --x + x++;
		System.out.println("\nC--->Value of X is "+x+","+"Value of Y is "+y+" and value of Z are "+z);
        
        boolean x1 =true;
		boolean y1 =true;
		boolean z1 ;
		z1 = x1 && y1 || !(x1 || y1);
		System.out.println("\nD--->Value of Z is "+z1);
 		
	}
}