package homeauto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource/")
public class MyResource {
    @GET
    @Path("getit")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }


    @GET
    @Path("hello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return "Hello! " + name;
    }

    @GET
    @Path("sum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int sum(@PathParam("a") int a,@PathParam("b") int b)
    {
        return a+b;
    }
}
