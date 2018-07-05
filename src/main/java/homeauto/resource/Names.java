package homeauto.resource;


import homeauto.dao.CategoryDao;
import homeauto.dao.NamesDao;
import homeauto.entities.DaoMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("names")

public class Names {
    public int add(String name) {
        return 0;
    }

    public boolean update(int id, String name) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<homeauto.entities.Names> getAllNames() {
        NamesDao dao;
        dao = new NamesDao();
        return DaoMapping.getAllNames(dao.getAllNames());
    }
    @PUT
    @Path("{member}")
    @Produces(MediaType.APPLICATION_JSON)
    public void createName(@PathParam("member") String member)
    {
        NamesDao dao=new NamesDao();
        dao.createName(member);
    }
}




