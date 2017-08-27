package yaya.basic.object;

public class StrSortVector {
private SortVector v = new SortVector(
		new Compare() {
			
			@Override
			public boolean lessThanOrEqual(Object lhs, Object rhs) {
				return 
				          ((String)lhs).toLowerCase().compareTo(
				          ((String)rhs).toLowerCase()) < 0;

			}
			
			@Override
			public boolean lessThan(Object lhs, Object rhs) {
				return 
				          ((String)lhs).toLowerCase().compareTo(
				          ((String)lhs).toLowerCase()) < 0;
			}
		});

private boolean sorted = false;

public void addElement(String s){
	v.addElement(s);
	sorted = false;
}
}
