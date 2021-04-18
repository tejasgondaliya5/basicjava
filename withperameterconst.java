class Main{
	String fname;
	String lname;
	int Age;
	
	public Main(String name , String surname , int age){
		fname = name;
		lname = surname;
		Age = age;
	}
	
	public static void main(String[] args){
		Main obj = new Main("tejas" , "Gondaliya" , 20);
		System.out.println("name is : " + obj.fname + " " + obj.lname);
		System.out.println("age is : " + obj.Age);
	}
}

// Outputs 1969 Mustang