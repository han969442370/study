package yaya.basic.object.clone;

import java.util.Enumeration;
import java.util.Vector;
//浅度克隆
public class Cloning{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(new Int(i));
		}
		Vector v2 = (Vector) v.clone();
		System.out.println("v:"+v);
		for (Enumeration e = v2.elements(); e.hasMoreElements();) {
			Int nextElement = (Int) e.nextElement();
			nextElement.increment();
		}
		System.out.println("v:"+v);
	}

}

class Int {
	private int i;

	public Int(int ii) {
		this.i = ii;
	}

	public void increment() {
		i++;
	}

	public String toString() {
		return Integer.toString(i);
	}
}
