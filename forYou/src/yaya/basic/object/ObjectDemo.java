package yaya.basic.object;

//供测试时使用类
public class ObjectDemo implements Cloneable {
private int i;
private String  name;
public ObjectDemo(int i,String name){
	this.i = i;
	this.name = name;
}
public void increment(){
	i++;
	this.name = name+i;
}
public Object clone(){
	Object o = null;
	try {
		o = super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return o;
}
public String toString(){
	return super.toString()+"["+this.i+","+this.name+"]";
}
}
