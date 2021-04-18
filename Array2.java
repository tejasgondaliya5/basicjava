class Array{
  public static void main(String[] args)
  {
    int[][] Array2 = {{101, 102, 103}, {104, 105, 106}};
    System.out.println(Array2[0][0]);
	System.out.println(Array2[0][1]);
	System.out.println(Array2[0][2]);
	System.out.println(Array2[1][0]);
	System.out.println(Array2[1][1]);
	System.out.println(Array2[1][2]);
	
	for(int i = 0; i < Array2.length; i++){
		for(int j = 0; j < Array2[i].length; j++){
		System.out.println(Array2[i][j]);
		}
	}
	
  }
}