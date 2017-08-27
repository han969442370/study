package yaya.basic.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class MyWorld {
	
	public static void main(String[] args) {
      House h = new House();
      Vector animals = new Vector();
      animals.addElement(new Animal("Bosco the dog",h));
      animals.addElement(new Animal("Ralph the hamster", h));
      animals.addElement(new Animal("Fronk the cat", h));
      try {
    	  ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
		ObjectOutputStream out1 = 
				  new ObjectOutputStream(buf1);
		out1.writeObject(animals);
		out1.writeObject(animals);
		
		ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
		ObjectOutputStream out2 = 
				  new ObjectOutputStream(buf2);
		out2.writeObject(animals);
		
		ObjectInputStream in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
	    ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
      
        Vector v1 =  (Vector) in1.readObject();
        Vector v2 = (Vector) in1.readObject();
        Vector v3 = (Vector) in2.readObject();
        System.out.println("object1: "+v1);
        System.out.println("object2: "+v2);
        System.out.println("object3: "+v3);
      } catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

}
class House implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class Animal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	
	House preferredHouse;
	
	public Animal(String nm,House h){
		this.name = nm;
		this.preferredHouse = h;
	}
	
	public String toString(){
		return name+"["+super.toString()+"],"+preferredHouse+"\n";
	}
	
}
