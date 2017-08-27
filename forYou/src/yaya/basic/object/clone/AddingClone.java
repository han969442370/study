package yaya.basic.object.clone;

import java.util.Enumeration;
import java.util.Vector;

public class AddingClone {

	public static void main(String[] args) {
		Int2 x = new Int2(10);
		Int2 x1 = (Int2) x.clone();
		x1.increment();
		System.out.println("x:"+x+" x1:"+x1);
		
		Int3 int3 = new Int3(11);
		System.out.println("int3:"+int3);
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(new Int2(i));
		}
		System.out.println("v:"+v);
		Vector v1 = (Vector) v.clone();
		
		for (int i = 0; i < v1.size(); i++) {
			v1.setElementAt(((Int2)v.elementAt(i)).clone(), i);
		}
		
		for (Enumeration e = v1.elements();e.hasMoreElements() ; ) {
			((Int2) e.nextElement()).increment();;
		}
		System.out.println("v:"+v);
		System.out.println("v1:"+v1);
		
	}

}

class Int2 implements Cloneable {
	private int i;

	public Int2(int ii) {
		this.i = ii;
	}

	public void increment() {
		i++;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("Int2 can't clone");
		}
		return o;
	}
	public String toString(){
		return Integer.toString(i);
	}
}

class Int3 extends Int2 {
	private int j;
	
	private String g = "g";

	public Int3(int i) {
		super(i);
	}
	public String toString(){
		return "j:"+this.j+" g:"+this.g;
	}
}