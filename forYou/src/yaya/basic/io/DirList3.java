package yaya.basic.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList3 {
	
	public static FilenameFilter filter(final String pathName){
		return new FilenameFilter() {
			String fn = pathName;
			@Override
			public boolean accept(File file, String name) {
				String f = new File(name).getName();
				return fn.indexOf(f) != -1;
			}
		};
	};

	public static void main(String[] args) {
		File path = new File("./src");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		}
		else{
			list = path.list(filter(args[0]));
		}
		for (String pathName : list) {
//            System.out.println(pathName);
            File  childPath = new File(path, pathName);
            if(childPath.isDirectory()){
            	System.out.println("我是目录:"+childPath.getName()+",我有很多的子目录，请看：");
            	String[] list2 = childPath.list();
            	for (String l2 : list2) {
					File f = new File(childPath,l2);
					if (f.isDirectory()) {
						System.out.println("我是"+childPath.getName()+"的子文件："+f.getName());
					}
				}
            }
            if (childPath.isFile()) {
				System.out.println("我是文件："+childPath.getName());
			}
		}
	}

}
