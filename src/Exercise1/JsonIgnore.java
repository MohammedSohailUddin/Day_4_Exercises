package Exercise1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//User-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface JsonIgnore
{
	String Name() default "Sohail";
	String DoB();
} 