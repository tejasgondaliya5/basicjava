class Encpsulation{
	private String name;
	
	public String getname(){
		return name;
	}
	public void setname(String newName){
		this.name = newName;
	}
	public static void main(String[] args){
		Encpsulation obj = new Encpsulation();
		obj.name = "tejas";
		System.out.println(obj.name);
	}
}
	