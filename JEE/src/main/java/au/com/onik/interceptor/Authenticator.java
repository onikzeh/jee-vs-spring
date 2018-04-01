package au.com.onik.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Authenticator {

    private static int instance = 0;

    public Authenticator() {
        System.out.println("Authenticator instance: "+instance++);
    }

    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("SimpleInterceptor - Logging BEFORE calling method :" + context.getMethod().getName());
        Object result = context.proceed();
        System.out.println("SimpleInterceptor - Logging AFTER calling method :" + context.getMethod().getName());
        return result;
    }
}