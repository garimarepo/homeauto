package homeauto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource/")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
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
