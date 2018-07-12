package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;


public class StoreDao {
    public List<Store> getAllStore()
    {
        try
        {
            Session session=SessionUtil.getSession();
            Query query=session.createQuery("from Store");
            List<Store> storeList=query.list();
            session.close();
            return storeList;

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    public void createStore(String store)
    {
        Session session = SessionUtil.getSession();
        session.getTransaction().begin();
        Store st=new Store();
        st.setName(store);
        session.save(st);
        session.getTransaction().commit();

    }
}
