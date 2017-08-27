package yaya.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.Vector;

public class CADState {

	public static void main(String[] args) {
		System.out.println(args);
		Vector shapeTypes = new Vector(), shapes = new Vector();
		if (args.length == 0) {
			shapeTypes = new Vector();
			shapes = new Vector();
			shapeTypes.addElement(Circle.class);
			shapeTypes.addElement(Square.class);
			shapeTypes.addElement(Line.class);
			for (int i = 0; i < 10; i++) {
				shapes.addElement(Shape.randomFactory());
			}
			for (int i = 0; i < 10; i++) {
				((Shape) shapes.elementAt(i)).setColor(Shape.GREEN);
				;
			}
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("\\E:\\hello.txt"));
				out.writeObject(shapeTypes);
				out.writeObject(shapes);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
             try {
				ObjectInputStream in = 
						 new ObjectInputStream(
								 new FileInputStream(args[0]));
				   shapeTypes = (Vector) in.readObject();
				   shapes = (Vector) in.readObject();
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
		System.out.println(shapes);
	}

}

abstract class Shape implements Serializable {
	public static final int RED = 1, BLUE = 2, GREEN = 3;
	private int xPos, yPos, dimension;
	private static Random r = new Random();
	private static int counter = 0;

	public abstract void setColor(int color);

	public abstract int getColor();

	public Shape(int xVal, int yVal, int dim) {
		this.xPos = xVal;
		this.yPos = yVal;
		this.dimension = dim;
	}

	public String toString() {
		return getClass().toString() + " color[" + getColor() + "] xPos[" + this.xPos + "] yPos[" + this.yPos + "] dim["
				+ this.dimension + "]\n";
	}

	public static Shape randomFactory() {
		int x = r.nextInt() % 100;
		int y = r.nextInt() % 100;
		int d = r.nextInt() % 100;
		switch (counter++ % 3) {
		default:
			;
		case 0:
			return new Circle(x, y, d);
		case 1:
			return new Square(x, y, d);
		case 2:
			return new Line(x, y, d);
		}

	}
}

class Circle extends Shape {

	public static int color = RED;

	public Circle(int xVal, int yVal, int dim) {
		super(xVal, yVal, dim);
		color = RED;
	}

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public int getColor() {
		return this.color;
	}

}

class Square extends Shape {

	public static int color = GREEN;

	public Square(int xVal, int yVal, int dim) {
		super(xVal, yVal, dim);
	}

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public int getColor() {
		return this.color;
	}

}

class Line extends Shape {

	public static int color = BLUE;

	public Line(int xVal, int yVal, int dim) {
		super(xVal, yVal, dim);
	}

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public int getColor() {
		return this.color;
	}

}