package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

/* Step 1: Define RoleAllowed annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();   // allowed role
}

/* Step 2: Create a service with restricted method */
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully");
    }

    public void viewUser() {
        System.out.println("User details displayed");
    }
}

/* Step 3: Simulate current user role */
class SecurityContext {
    static String currentRole;
}

/* Step 4: Access control using Reflection */
public class RoleBasedAccessExample {

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        // Change role here to test
        SecurityContext.currentRole = "USER";   // try ADMIN / USER

        Method method = AdminService.class.getDeclaredMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (SecurityContext.currentRole.equals(roleAllowed.value())) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
