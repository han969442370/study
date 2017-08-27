package yaya;

import yaya.basic.com.A;
import yaya.basic.com.B;

public class Test {

	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("");
//		System.out.println(sf.length());
	/*	try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			long startTime = sdf.parse("2013-04-29").getTime();
			long now = sdf.parse("2015-10-5").getTime();
			System.out.println((now-startTime)/(1000*60*60*24));
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			18320701736
		}
		*/
//		System.out.println(MD5Util.getMd5("90000" +"PL220001225333"+ "@Sto.2014"));
		/*try {    
		    int passed = 0, failed = 0;
			for (Method m : Class.forName(args[0]).getMethods()) {
			     if (m.isAnnotationPresent(AnotationTest.class)) {
			        try {
			           m.invoke(null);
			           passed++;
			        } catch (Throwable ex) {
			           System.out.printf("Test %s failed: %s %n", m, ex.getCause());
			           failed++;
			        }
			     }
			  }
	      System.out.printf("Passed: %d, Failed %d%n", passed, failed); 
	    } catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*String a = "fdwar,ret,drer,";
		String b = a.substring(0,a.lastIndexOf(","));
		String[] idArray = b.split(",");
		for (int i = 0; i < idArray.length; i++) {
			System.out.println(i+":"+idArray[i]);
		}*/
		/*DecimalFormat    df   = new DecimalFormat("#0.00");  
		double a =111;
		System.out.println(df.format(a/1000));*/
		/*String s = " <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<CBECMESSAGE>\n    <MESSAGEHEAD>\n";
		String all = s.replaceAll("\n", "");
		System.out.println(all);*/
		A a = new A();
		B b = new B();
		b.hello();
	}
}
