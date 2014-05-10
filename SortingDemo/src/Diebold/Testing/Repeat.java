package Diebold.Testing;

import java.lang.annotation.*;

/**
 * @author kreich
 * retrieved from https://code.google.com/p/ai4u/source/browse/com.ai4u.util/trunk/src/com/ai4u/util/junit/Repeat.java
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Repeat {

        int value();
        
}
