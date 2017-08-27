package yaya.basic.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {

	class DirFilter implements FilenameFilter{

		String afn;
		
		public DirFilter(String afn) {
			super();
			this.afn = afn;
		}

		@Override
		public boolean accept(File dir, String name) {
			String f = new File(name).getName();
			return f.indexOf(afn) != -1;
		}
		
	}
	public static void main(String[] args) {
		DirList dr = new DirList();
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		}
		else{
		   list = path.list(dr.new DirFilter(args[0]));
		}
		for (String pathName : list) {
			System.out.println(pathName);
		}
	}

}
