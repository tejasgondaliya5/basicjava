// Create a Main class
class Main{
	int x;  //this variable is declear  main class this variable use only constructor
	// int y;  //int y is not declear constructor can not use y variable       
	
	public Main(int a){
		x = a;
		// y = x + 5; // y is not declear so this fuction can not run 
		
		
	}
	
	public static void main(String[] args){
		Main obj = new Main(20);
		System.out.println(obj.y);
		
	}

