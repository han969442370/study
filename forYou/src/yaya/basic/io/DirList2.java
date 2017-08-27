package yaya.basic.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList2 {
	
	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		}
		else{
			list = path.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					return new File(name).getName().indexOf(args[0]) != -1;
				}
			});
		}
		for (String pathName : list) {
            System.out.println(pathName);			
		}
	}

}
