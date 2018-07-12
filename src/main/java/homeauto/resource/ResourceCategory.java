package homeauto.resource;

import homeauto.dao.CategoryDao;
import homeauto.entities.Category;
import homeauto.entities.DaoMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("categories")
public class ResourceCategory {
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
    public List<Category> getAllCategories() {
        CategoryDao dao = new CategoryDao();
        return DaoMapping.getAllCategories(dao.getAllCategories());
    }

    @PUT
    @Path("{name}")

    public void createCategory(@PathParam("name") String name)
    {
        CategoryDao dao = new CategoryDao();
        dao.createCategory(name);

    }


}

