package yaya.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ThawAlien {

	public static void main(String[] args) {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("\\E:\\hello.txt"));
		    Object a = null;
			while ((a = objectIn.readObject()) != null) {
				System.out.println("object:"+a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
