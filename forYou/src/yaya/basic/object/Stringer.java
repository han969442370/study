package yaya.basic.object;

public class Stringer {

	public static String upcast(String s){
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
      String a = new String("howdy");
      String upA = upcast(a);
      System.out.println("a:"+a);
      System.out.println("upA:"+upA);
	}

}
