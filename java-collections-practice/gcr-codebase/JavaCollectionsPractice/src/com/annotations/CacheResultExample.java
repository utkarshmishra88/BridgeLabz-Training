package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* Step 1: Define CacheResult annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

/* Step 2: Class with expensive method */
class Calculator {

    @CacheResult
    public int square(int x) {
        System.out.println("Computing square for " + x);
        return x * x;
    }
}

/* Step 3: Cache handler using Reflection */
class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) throws Exception {

        Class<?> cls = obj.getClass();
        Method method = cls.getDeclaredMethod(methodName, int.class);

        // Create cache key (method name + arguments)
        String cacheKey = methodName + "_" + args[0];

        // Check if method has @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {

            // Return cached value if present
            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result");
                return cache.get(cacheKey);
            }

            // Execute method and cache result
            Object result = method.invoke(obj, args);
            cache.put(cacheKey, result);
            return result;
        }

        // Normal execution if no caching
        return method.invoke(obj, args);
    }
}

/* Step 4: Test caching system */
public class CacheResultExample {
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        System.out.println(CacheExecutor.execute(calc, "square", 5));
        System.out.println(CacheExecutor.execute(calc, "square", 5)); // cached
        System.out.println(CacheExecutor.execute(calc, "square", 6));
        System.out.println(CacheExecutor.execute(calc, "square", 6)); // cached
    }
}
