package homeauto.resource;

import homeauto.dao.StoreDao;
import homeauto.entities.DaoMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("stores")
public class Store {
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
    public List<homeauto.entities.Store> getAllStores() {
        StoreDao dao;
        dao = new StoreDao();
        return DaoMapping.getAllStores(dao.getAllStore());
    }
    @PUT
    @Path("{store}")
    public void createStore(@PathParam("store") String store)
    {
        StoreDao dao=new StoreDao();
        dao.createStore(store);
    }

}

