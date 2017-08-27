package yaya.basic.io;

import java.io.File;
import java.io.FilenameFilter;

import yaya.basic.object.StrSortVector;

public class SortedDirList {
	
	private File path;
	
	private String[] list;
	
	public SortedDirList(final String afn){
		path = new File(".");
		if (afn == null) {
			list = path.list();
		}
		else {
			list = path.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					String pathName = new File(name).getName();
					return pathName.indexOf(afn) != -1;
				}
			});
		}
	}
	
	void print(){
		for (String pathName : list) {
			System.out.println(pathName);
		}
	}
	
	private void sort(){
		StrSortVector sv = new StrSortVector();
		for (String str : list) {
			sv.addElement(str);
		}
	}
	

	public static void main(String[] args) {
            SortedDirList sd;
            if (args.length == 0) {
				sd = new SortedDirList(null);
			}
            else{
            	sd = new SortedDirList(args[0]);
            	sd.print();
            }
	}

}
