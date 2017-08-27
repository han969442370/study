package yaya.basic.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Blips {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		System.out.println("Constructing objects:");
		Blips1 b1 = new Blips1();
		Blips2 b2 = new Blips2();
		Blips3 b3 = new Blips3(3,"hello world");
		Blips4 b4 = new Blips4(4,"hello world");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("\\E:\\hello.txt"));
			System.out.println("saving objects:");
			out.writeObject(b1);
			out.writeObject(b2);
			out.writeObject(b3);
			out.writeObject(b4);
			out.writeObject(null);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("\\E:\\hello.txt"));
			System.out.println("recovery objects:");
			Blips1 b11 = (Blips1) in.readObject();
			Blips2 b12 = (Blips2) in.readObject();
			Blips3 b13 = (Blips3) in.readObject();
			Blips4 b14 = (Blips4) in.readObject();
			System.out.println("b13  i:"+b13.i+"  s:"+b13.s);
			System.out.println("b14 i:"+b14.i+"   s:"+b14.s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

class Blips1 implements Externalizable {

	public Blips1() {
		System.out.println("Blips1 constructor");
	}

	@Override
	public void readExternal(ObjectInput paramObjectInput) throws IOException, ClassNotFoundException {
		System.out.println("Blips1 readExternal");
	}

	@Override
	public void writeExternal(ObjectOutput paramObjectOutput) throws IOException {
		System.out.println("Blips1 writeExternal");
	}

}

class Blips2 implements Externalizable {

	public Blips2() {
		System.out.println("Blips2 constructor");
	}

	@Override
	public void writeExternal(ObjectOutput paramObjectOutput) throws IOException {
		System.out.println("Blips2 writeExternal");
	}

	@Override
	public void readExternal(ObjectInput paramObjectInput) throws IOException, ClassNotFoundException {
		System.out.println("Blips2 readExternal");
	}

}

class Blips3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int i;

	transient
	String s;

	public Blips3() {
	}

	public Blips3(int i, String s) {
		this.i = i;
		this.s = s;
	}

	public String toString() {
		return s + i;
	}
}

class Blips4 implements Externalizable {

	int i;

	String s;

	public Blips4() {
	}

	public Blips4(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public void writeExternal(ObjectOutput paramObjectOutput) throws IOException {
		System.out.println("Blips4 writeExternal");
        paramObjectOutput.writeObject(s);
        paramObjectOutput.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput paramObjectInput) throws IOException, ClassNotFoundException {
      System.out.println("Blips4 readExternal");
      Object o = paramObjectInput.readObject();
      if (o  instanceof String) {
		s = (String) o;
	}
      i = paramObjectInput.readInt();
	}

	public String toString() {
		return s + i;
	}
}