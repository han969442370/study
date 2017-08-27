package yaya.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import yaya.basic.com.A;

public class Test{

	@org.junit.Test
	public void test() {
//		System.out.println(new BigDecimal(10).compareTo(new BigDecimal(10)));
	/*	System.out.println("1533310000000000".replaceAll(".00", ""));
		System.out.println(".001533310000000000".replace(".00", ""));*/
//		System.getProperty("encoding");
//		System.out.println("你是风儿我是啥，等待卖家发货".contains("等待卖家发货"));
		System.out.println(" fd fdre ".trim());
		System.out.println(" fd fdre ");
	}

	@org.junit.Test
	public void test1() {
		Integer a = 0;
		Integer b = null;
		System.out.println(a.equals(0));
	}
	@org.junit.Test
	public void test2() {
		A a = new A();
		System.out.println(294*500*300);
	}
	@org.junit.Test
	public void test3(){
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		Runtime r = Runtime.getRuntime();
		System.out.println("totalMemory:"+r.totalMemory()+" "+"free memory:"+r.freeMemory());
		String a = "rer";
		a.equals("fe");
	}
	@org.junit.Test
	public void test4(){
////		System.out.println(Integer.parseInt(null));
////		System.out.println(3*128.88);
//	/*	List<String> lis = new ArrayList<String>();
//		lis.add("re");
//		lis.add("ggg");
//		lis.add("ee");
//		System.out.println(lis.subList(0, 2));*/
//		StringBuffer s = new StringBuffer("reretrgggggrt");
//		System.out.println(s.substring(0, s.lastIndexOf("t")));
		Map<String,String> re = new HashMap<String,String>();
		re.put("_input_charset", "ass");
		re.put("amount","bss");
		re.put("customs_place","abss");
		re.put("merchant_customs_name","adbss");
		re.put("out_request_no", "rer");
		re.put("partner", "rer");
		re.put("service", "rer");
		re.put("trade_no", "rer");
		re.put("merchant_customs_code", "ere");
		System.out.println(re.keySet());
		System.out.println(new TreeMap<String, String>(re).keySet());
		StringBuffer sf = new StringBuffer("https://mapi.alipay.com/gateway.do?trade_no=2015051446800462&merchant_customs_code=hanguo&");
		String st = sf.subSequence(sf.indexOf("?")+1, sf.lastIndexOf("&")).toString();
	    System.out.println(st);	
	}
	@org.junit.Test
	public void test5(){
		System.out.println(150*10000/(10000-0.5*65*100));
	}
	@org.junit.Test
	public void test6() throws Exception{
		C c = new C();
		c.name = "hello saaa";
		Method[] methods = C.class.getDeclaredMethods();
		for (Method method : methods) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			if (parameterTypes.length >0) {
				for (Class<?> class1 : parameterTypes) {
					if (class1 == String.class) {
						System.out.println("我将要调用含有String类型参数的方法");
						method.invoke(C.class.newInstance(),"fere");
					}
				}
			}
			else{
				System.out.println("我走的是方法一");
				method.invoke(c,null);
			}
		}
	}
	@org.junit.Test
	public void Test7() throws NoSuchMethodException, SecurityException{
		C c = new C();
		c.name = "hello saaa";
		c.getClass().getMethod("say", String.class);
	}
	@org.junit.Test
	public void Test8(){
		System.out.println(caculatePageCount(1,2));
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		String idsStr = ids.toString();
		System.out.println(idsStr.substring(ids.indexOf("[")+1));
	}
	public Integer caculatePageCount(Integer totalData,Integer pageSize){
		return (totalData%pageSize>0)?totalData/pageSize+1:totalData/pageSize;
	}
}
