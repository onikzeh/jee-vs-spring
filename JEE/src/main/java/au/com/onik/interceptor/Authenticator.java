package au.com.onik.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Authenticator {

    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        // Do authentication
        return context.proceed();
    }
}