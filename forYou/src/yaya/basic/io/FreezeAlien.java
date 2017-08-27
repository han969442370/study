package yaya.basic.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FreezeAlien {

	public static void main(String[] args) {
    try {
    	Alien alien = new Alien();
		ObjectOutputStream os = 
				new ObjectOutputStream(
						new FileOutputStream("\\E:\\hello.txt"));
		os.writeObject(alien);
		os.writeObject(null);
		os.flush();
		os.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
