package yaya.anotation;

import yaya.anotation.AnotationTestInfo.Priority;

@AnotationTestInfo(priority=Priority.HIGH,createBy="Mr Li",lastModified = "2014-10-23",tags = {"anotaion test","anotation validate"})
public class TestExample {
	@AnotationTest(enabled = true)
	public void m1(){
		System.out.println("i am method1");
	}
	
	@AnotationTest(enabled = false)
    public void m2(){
        System.out.println("i am method2");
	}

	public void m3(){
        System.out.println("i am method3");	
	}
	
	@AnotationTest(enabled = false)
	public void m4(){
		System.out.println("i am method4");
	}
	
}
