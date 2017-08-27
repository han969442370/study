package yaya.basic.object.clone;

public class CopyConstructor {

	public static void main(String[] args) {
      Tamato t = new Tamato();
      ripen(t);
      slice(t);
      GreenZebra g = new GreenZebra();
      ripen(g);
      slice(g);
      g.evaluate();
	}
	public static void  ripen(Tamato t){
	  t = new Tamato(t);
	  System.out.println("in ripen, t is a"+t.getClass().getName());
	}

	public static void slice(Fruit f){
		f = new Fruit(f);
		System.out.println("in slice ,f is a"+f.getClass().getName());
	}
}
class FruitQualities{
	private int weight;
	private int color;
	private int firmness;
	private int repeness;
	private int smell;
	FruitQualities(){}
	//copy constructor
	FruitQualities(FruitQualities f){
		this.weight = f.weight;
		this.color = f.color;
		this.firmness = f.firmness;
		this.repeness = f.repeness;
		this.smell = f.smell;
	} 
}
class Seed{
	Seed(){}
	Seed(Seed s){}
}
class Fruit{
	private FruitQualities fq;
	private int seeds;
	private Seed[] s;
	/**
	 * @param f
	 * @param seedCount
	 */
	Fruit(FruitQualities f,int seedCount){
		this.fq = f;
		this.seeds = seedCount;
		s = new Seed[seeds];
		for (int i = 0; i < seedCount; i++) {
			s[i] = new Seed();
		}
	}
	Fruit(Fruit f){
		this.fq = f.fq;
		this.seeds = f.seeds;
		s = new Seed[seeds];
		for (int i = 0; i < f.seeds; i++) {
			s[i] = new Seed(f.s[i]);
		}
	}
	protected void addQualities(FruitQualities f){
		this.fq = f;
	}
	protected FruitQualities getQualities(){
		return this.fq;
	}
}
class Tamato extends Fruit{

	Tamato() {
		super(new FruitQualities(),100);
	}
	Tamato(Tamato t){
		super(t);
	}
}
class ZebraQualities extends FruitQualities{
	private int stripedness;
	
	ZebraQualities(){
	}
	ZebraQualities(ZebraQualities z){
		super(z);
		this.stripedness = z.stripedness;
	}
}
class GreenZebra extends Tamato{
	GreenZebra(){
		addQualities(new ZebraQualities());
	}
	GreenZebra(GreenZebra g){
		super(g);
		addQualities(new ZebraQualities());
	}
	void evaluate(){
		ZebraQualities zq = (ZebraQualities) getQualities();
	}
}