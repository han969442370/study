package yaya.anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTest {
	
	public static void main(String[] args) {
	    System.out.println("test ............");
	    int sucess = 0,failed = 0,count = 0, ignore = 0;
	    Class<TestExample> obj = TestExample.class;
	    
	    //process @AnotaionTestInfo
	    if (obj.isAnnotationPresent(AnotationTestInfo.class)) {
			Annotation anotation = obj.getAnnotation(AnotationTestInfo.class);
			AnotationTestInfo anotationTestInfo = (AnotationTestInfo) anotation;
			System.out.printf("%nPriority:%s",anotationTestInfo.priority());
			System.out.printf("%ncreateBy:%s", anotationTestInfo.createBy());
			System.out.printf("%ntags:");
			int tagLength = anotationTestInfo.tags().length;
			for (String tag : anotationTestInfo.tags()) {
				if (tagLength >1) {
					System.out.println(tag+",");
				}
				else{
					System.out.println(tag);
				}
			}
           System.out.printf("%nlastModified:%s%n%n",anotationTestInfo.lastModified());			
		}
	    
	    //process @AnotationTest
	    for (Method method : obj.getDeclaredMethods()) {
			if (method.isAnnotationPresent(AnotationTest.class)) {
				Annotation annotation = method.getAnnotation(AnotationTest.class);
				AnotationTest anotationTest = (AnotationTest) annotation;
				if (anotationTest.enabled()) {
					sucess++;
				}
				else{
					ignore++;
				}
			}
			else{
				failed += 1;
			}
			count ++;
		}
	    System.out.println("count:"+count+" success:"+sucess+" ignore:"+ignore+" failed:"+failed);
	}

}
