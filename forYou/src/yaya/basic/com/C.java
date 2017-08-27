package yaya.basic.com;

public class C{
    //用final关键字修饰的类没有子类不能被其他类继承，但本身可以继承其他类。
	public static void main(String[] args) {
		FinalClass a = new FinalClass();
		System.out.println(a.sex);
		FinalClass f = new FinalClass();
	}

}
