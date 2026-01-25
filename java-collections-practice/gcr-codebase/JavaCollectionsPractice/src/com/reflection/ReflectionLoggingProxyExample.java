package com.reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Interface
interface Greeting {
    void sayHello(String name);
}

// Real implementation
class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

// Logging proxy handler
class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Log before method execution
        System.out.println("Calling method: " + method.getName());

        // Call actual method
        return method.invoke(target, args);
    }
}

public class ReflectionLoggingProxyExample {
    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingHandler(original)
        );

        // Call method via proxy
        proxy.sayHello("Emma");
    }
}
