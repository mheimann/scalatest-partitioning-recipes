package example.tags;

import java.lang.annotation.*;

@org.scalatest.TagAnnotation
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface UnitTag { }