package yaya.basic.object.clone;

public class LocalCopy {
	
	static MyObject g(MyObject v){
		v.i++;
		return v;
	}	
	static MyObject f(MyObject v){
		MyObject o = (MyObject) v.clone();
		o.i++;
		return o;
	}

	public static void main(String[] args) {
		MyObject a = new MyObject(10);
		MyObject b = g(a);
		if (a == b) {
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		MyObject c = new MyObject(11);
		MyObject d = f(c);
		if (c == d) {
			System.out.println("c==d");
		}
		else{
			System.out.println("c!=d");
		}
		System.out.println("c="+c);
		System.out.println("d="+d);
	}

}
class MyObject implements Cloneable{
	int i;
	public MyObject(int ii){
		this.i = ii;
	}
	public Object clone(){
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("MyObject can't clone");
		}
		return o;
	}
	public void increment(){
		i++;
	}
	public String toString(){
		return Integer.toString(i);
	}
}
