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

    public static List<homeauto.entities.Names> getAllNames(List<homeauto.dao.Names> daoNames) {
        List<homeauto.entities.Names> names = new ArrayList<homeauto.entities.Names>();
        for (homeauto.dao.Names nm : daoNames)
            names.add(nm.getNames());
        return names;

    }

    public static List<homeauto.entities.Transaction> getAllTransactions(List<homeauto.dao.Transactions> daoTransactions) {

        List<homeauto.entities.Transaction> transactions = new ArrayList<homeauto.entities.Transaction>();

        for (homeauto.dao.Transactions t : daoTransactions)
            transactions.add(t.getTransactions());

        return transactions;
    }
}

