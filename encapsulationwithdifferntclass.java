class Main{
	public static void main(String[] args) {
    Encpsulation myObj = new Encpsulation();
    myObj.setname("tejas");
    System.out.println(myObj.getname());
  }
	
}
class Encpsulation{
	private String name;
	
	public String getname(){
		return name;
	}
	public void setname(String newName){
		this.name = newName;
	}
	
}