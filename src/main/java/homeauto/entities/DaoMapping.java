package homeauto.entities;

import homeauto.dao.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neeraj on 17/06/18.
 */
public class DaoMapping {
    public static List<homeauto.entities.Category> getAllCategories(List<homeauto.dao.Category> daoCategoreis) {
        List<homeauto.entities.Category> categoreis =new ArrayList<homeauto.entities.Category>();
        for(Category cat: daoCategoreis) {
            categoreis.add(cat.getCategory());
        }
        return categoreis;
    }
}
