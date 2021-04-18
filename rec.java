public class Main {
	
  public static void main(String[] args) {
	  
    int result = fac(5);
    System.out.println(result);
  }
  
  static int fac(int k) {
    if (k == 1) {
      return 1;
    } else {
      return k * fac(k - 1);
    }
  }
}



