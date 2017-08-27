package yaya.basic.object.clone;

//创建的新对象 默认继承Object，但默认不具备clone能力，一个实现了clone方法，他的后裔全部具有克隆能力
public class HorrorFlick {

	public static void main(String[] args) {
		Person p = new Person();
		Hero h = new Hero();
		// Person p1 = (person)p.clone(); compiler error
		// Hero h1 = (Hero)h.clone(); compiler error
		Scientist s = new Scientist();
		Scientist s1 = (Scientist) s.clone();
		MadScientist ms = new MadScientist();
		MadScientist ms1 = (MadScientist) ms.clone();
	}

}
class Person{}
class Hero extends Person{}
class Scientist extends Person implements Cloneable{
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("this object can't clone");
			return null;
		}
	}
}
class MadScientist extends Scientist{}
