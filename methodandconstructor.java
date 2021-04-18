class Main{
	int x;
	public int Thefun(int y , int z){       // this  is method 
		int p = y;
		int q = z;
		return p+q;
	}
		
		
	public Main(int a){       //this is constoructor
		x = a;
		// y = x + 5; // y is not declear so this fuction can not run 
		
		
	}
	
	public static void main(String[] args){
		Main obj = new Main(20);
		System.out.println(obj.x);
		int z = obj.Thefun(10 , 20);
		System.out.println(z);
		
	}
}
	