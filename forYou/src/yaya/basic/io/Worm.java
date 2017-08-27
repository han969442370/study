package yaya.basic.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Worm implements Serializable{
	
	private static int r(){
		return (int)(Math.random()*10);
	}

	private Data[] d = {new Data(r()),new Data(r()),new Data(r())};
	
	private Worm next;
	
	private char c;
	
	Worm(int i,char x){
		System.out.println("worm constructor:"+i);
		c = x;
		if(--i>0){
			next = new Worm(i,(char)(x+1));
		}
	}
	
	
	public Worm() {
		System.out.println("Default constructor");
	}

	public String toString(){
		String s = ":"+c+"(";
		for (int i = 0,len=d.length;i<len;i++) {
			s+=d[i].toString();
		}
		s+=")";
		if (next != null) {
			s+=next.toString();
		}
		return s;
	}

	public static void main(String[] args) {
		Worm w = new Worm(6, 'a');
		System.out.println("w=" + w);
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(
							new FileOutputStream("\\E:\\hello.txt"));
			out.writeObject("Worm storage");
			out.writeObject(w);
			out.writeObject(null);
			out.close();
			ObjectInputStream in =
					new ObjectInputStream(
							new FileInputStream("\\E:\\hello.txt"));
			String s = (String) in.readObject();
			Worm w2 = (Worm) in.readObject();
			System.out.println(in.readObject());
			System.out.println(s+",w2="+w2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ByteArrayOutputStream bout = 
					new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject("Worm storage");
			out.writeObject(w);
			out.flush();
			ObjectInputStream in = 
					new ObjectInputStream(
							new ByteArrayInputStream(bout.toByteArray()));
			String s = (String) in.readObject();
			Worm w3 = (Worm) in.readObject();
			System.out.println(s+",w3="+w3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i;
	Data(int x){
		i = x;
	}
	public String toString(){
		return Integer.toString(i);
	}
}
