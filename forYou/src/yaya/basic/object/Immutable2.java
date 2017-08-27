package yaya.basic.object;

/**
 * @author hanfs
 * 描述：同志类
 * 适用场合：需要不可变的对象，而且经常需要进行大量的修改，创建新的不变对象代价太高
 *2016年4月27日
 */
class Mutable{
	private int data;
	public Mutable(int initVal){
		this.data = initVal;
	}
	public Mutable add(int x){
		this.data+=x;
		return this;
	}
	public Mutable multiply(int y){
		this.data*=y;
		return this;
	}
	public Immutable2 makeImmutable2(){
		return new Immutable2(this.data);
	}
}


public class Immutable2 {
	
	private int data;
	
	public int read(){
		return this.data;
	}
	
	public Immutable2(int initVal){
		this.data = initVal;
	}

	public boolean noneZero(){
		return this.data != 0;
	}
	
	public Immutable2 add(int x){
		return new Immutable2(data+x);
	}
	
	public Immutable2 multiply(int y){
		return new Immutable2(data*y);
	}
	
	public Mutable makeMutable(){
		return new Mutable(data);
	}
	
	public static Immutable2 modify1(Immutable2 x){
		Immutable2 val = x.add(12);
		val = val.multiply(3);
	    val = val.add(11);
	    val = val.multiply(2);
        return val;
	}
	
	public static Immutable2 modify2(Immutable2 x){
		Mutable mutable = x.makeMutable();
		mutable.add(12).multiply(3).add(11).multiply(2);
	    return mutable.makeImmutable2();
	}
	
	public static void main(String[] args) {
	Immutable2 i = new Immutable2(10);
	Immutable2 r1 = modify1(i);
	Immutable2 r2 = modify2(i);
	System.out.println("i:"+i.read());
	System.out.println("r1:"+r1.read());
	System.out.println("r2:"+r2.read());
	}

}
