// method overloading is same name but differnt perameter 
class Main{
	static int Methoverloading(int a, int b){  // EX: int a; "a" is same name but differnt paramete 
		return a+b;
	}
		
	static double Methoverloading1(double a, double b){  // EX: double a; "a" is same name but differnt paramete 
		
	}
		
	public static void main(String[] args){
		int x = Methoverloading(5 , 6);
		double y = Methoverloading1(12.5 , 15.7);
		System.out.println(x);
		System.out.println(y);
	}
}
		