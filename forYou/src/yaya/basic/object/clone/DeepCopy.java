package yaya.basic.object.clone;

public class DeepCopy {

	public static void main(String[] args) {

	}

}

class DepthReading implements Cloneable {
	private double depth;

	public DepthReading(double d) {
		this.depth = d;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
}

class TemperatrueReading implements Cloneable {
	private long time;
	private double temperatrue;

	public TemperatrueReading(double tem) {
		this.time = System.currentTimeMillis();
		this.temperatrue = tem;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

}

class OceanReading implements Cloneable {
	private DepthReading depth;
	private TemperatrueReading temperatrue;

	public OceanReading(double tdata, double ddata) {
		this.depth = new DepthReading(ddata);
		this.temperatrue = new TemperatrueReading(tdata);
	}

	public Object clone() {
		OceanReading o = null;
		try {
			o = (OceanReading) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		if (o != null && o.depth != null) {
			o.depth = (DepthReading) o.depth.clone();
		}
		if (o != null && o.temperatrue != null) {
			o.temperatrue = (TemperatrueReading) o.temperatrue.clone();
		}
		return o;
	}
}
