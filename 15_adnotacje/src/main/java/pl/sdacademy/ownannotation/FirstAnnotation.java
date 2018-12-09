package pl.sdacademy.ownannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.FIELD, ElementType.TYPE})

@Retention(RetentionPolicy.CLASS)
public @interface FirstAnnotation {
  String value() default "";
  int lenght();


}
