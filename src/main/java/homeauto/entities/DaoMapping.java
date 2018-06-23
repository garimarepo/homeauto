package homeauto.entities;

import homeauto.dao.Category;

import java.util.ArrayList;
import java.util.List;


public class DaoMapping {
    public static List<homeauto.entities.Category> getAllCategories(List<homeauto.dao.Category> daoCategoreis) {
        List<homeauto.entities.Category> categoreis = new ArrayList<homeauto.entities.Category>();
        for (Category cat : daoCategoreis) {
            categoreis.add(cat.getCategory());
        }
        return categoreis;
    }

    public static List<homeauto.entities.Store> getAllStores(List<homeauto.dao.Store> daoStore) {
        List<homeauto.entities.Store> stores = new ArrayList<homeauto.entities.Store>();
        for (homeauto.dao.Store st : daoStore)
            stores.add(st.getStore());


        return stores;
    }
}
