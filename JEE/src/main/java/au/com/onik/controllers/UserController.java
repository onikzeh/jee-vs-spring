package au.com.onik.controllers;

import au.com.onik.domain.User;
import au.com.onik.interceptor.Authenticator;
import au.com.onik.service.UserService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class UserController {

    //@Inject  Can be used for Liberty not for WAS. For WAS, @EJB must be used and also UserController must be annotated with @Stateless
    // In Liberty, there is no need to annotate the class with @Stateless
    @EJB
    private UserService userService;

    private static int instance = 0;

    public UserController() {
        System.out.println("UserController instance: "+instance++);
    }

    @GET
    @Path("/list")
    @Interceptors(Authenticator.class)
    public List<User> listUsers() {
        return userService.listAll();
    }

}
