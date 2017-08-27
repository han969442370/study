package yaya.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnotationTestInfo {
	
public enum Priority{LOW,MEDIUM,HIGH}

Priority priority() default Priority.MEDIUM;

String[] tags() default "";

String createBy() default "Mr Han";

String lastModified() default "27/10/2015";

}
