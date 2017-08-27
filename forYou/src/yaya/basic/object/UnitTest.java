package yaya.basic.object;

import static org.junit.Assert.*;

import org.junit.Test;
//对象之（传递和返回对象demo单元测试类）
public class UnitTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//测试对象浅复制
	@Test
	public  void test1(){
		ObjectDemo od = new ObjectDemo(10, "hello");
		ObjectDemo copy =  (ObjectDemo) od.clone();
		System.out.println("before copy od:"+od);
		copy.increment();
		System.out.println("after copy od:"+od);
		System.out.println("copy:"+copy);
	}
	@Test
	public void test2(){
		
	}

}
