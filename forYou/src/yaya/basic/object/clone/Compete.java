package yaya.basic.object.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Compete {
	static int SIZE = 500;

	public static void main(String[] args) {
		Thing2[] a = new Thing2[SIZE];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Thing2();
		}
		Thing4[] b = new Thing4[SIZE];
		for (int i = 0; i < b.length; i++) {
          b[i] = new Thing4();
		}
		try {
			long t1 = System.currentTimeMillis();
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(buf);
			for (int i = 0; i < a.length; i++) {
				out.writeObject(a[i]);
			}
			ByteArrayInputStream bns = new ByteArrayInputStream(buf.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bns);
			Thing2[] thing2 = new Thing2[SIZE]; 
			for (int i = 0; i < a.length; i++) {
				thing2[i] = (Thing2) in.readObject();
			}
			long t2 = System.currentTimeMillis();
			System.out.println("serializable cost time:"+(t2-t1));
			
			long tt1 = System.currentTimeMillis();
			Thing4[] thing4 = new Thing4[SIZE];
			for (int i = 0; i < b.length; i++) {
				thing4[i] = (Thing4) b[i].clone();
			}
			long tt2 = System.currentTimeMillis();
			System.out.println("clone time:"+(tt2-tt1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class Thing1 implements Serializable{}
class Thing2 implements Serializable{
	Thing1 o1 = new Thing1();
}
class Thing3 implements Cloneable{
	public Object clone(){
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}
class Thing4 implements Cloneable{
	Thing3 thing3 = new Thing3();
	public Object clone(){
		Thing4 thing4 = null;
		try {
			thing4 = (Thing4) super.clone();
			thing4.thing3 = (Thing3) thing4.thing3.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing4;
	}
}