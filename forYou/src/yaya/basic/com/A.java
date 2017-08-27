package yaya.basic.com;

public class A {
	
	public final B b;
	
public A() {
		super();
		//final 修饰的属性 一定要初始化，要么在属性申明时，要么在对象构建 器里
		this.b = new B();
	}
public String name;
       String age;
protected String sex;
private String address;
protected void say(){
	System.out.println("hello");
}
}
