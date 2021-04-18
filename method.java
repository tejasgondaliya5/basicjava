class Main{
	static int Fun(int n , int m){  // int is return value and print value
		int x = n;
		int y = m;
		int z = x + y;
		System.out.println(z);
		return z;
	}
		
	static void Fun1(int a , int b){  // void is only print value but not return aney value
		int p = a;
		int q = b;
		int r = p + q;
		System.out.println(r);
		
	}
		
	public static void main(String[] args){
		System.out.println(Fun(10 , 20));
		Fun1(5 , 7);
		
	}
}
		