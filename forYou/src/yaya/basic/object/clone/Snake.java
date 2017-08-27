package yaya.basic.object.clone;

public class Snake implements Cloneable {
	private Snake next;

	private char c;

	public Snake(int i, char x) {
		c = x;
		if (--i > 0) {
			this.next = new Snake(i, (char) (x + 1));
		}
	}

	public void increment() {
		c++;
		if (next != null) {
			next.increment();
		}
	}

	public String toString() {
		String s = ":" + c;
		if (next != null) {
			s += next.toString();
		}
		return s;
	}

	public Object clone() {
		Snake s = null;
		try {
			s = (Snake) super.clone();
			if (s.next != null) {
				s.next = (Snake) s.next.clone();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}

	public static void main(String[] args) {
          Snake s1 = new Snake(5, 'a');
          System.out.println("s"+s1);
          Snake s2 = (Snake) s1.clone();
          System.out.println("s"+s2);
          s2.increment();
          System.out.println("s"+s2);
          System.out.println("s1"+s1);
          
	}

}
