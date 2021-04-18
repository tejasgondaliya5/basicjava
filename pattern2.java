public class Main2{
  public static void main(String[] args) {
	int row = 5;
    for(int i=0; i<row; i++)   
	{  
      for(int j=row-i-1; j>0; j--)   
      {   
	  System.out.print("  "); }
		
		for(int j=0; j<=i; j++)
		{ 
		System.out.print(j + " "); }
      System.out.println();
	  
	}
  }
}