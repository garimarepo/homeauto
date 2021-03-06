package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;


public class NamesDao {
    public List<Names> getAllNames() {
        try {
            Session session = SessionUtil.getSession();
            Query query = session.createQuery("from Names");
            List<Names> nameList = query.list();
            session.close();
            return nameList;


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void createName(String member)
    {
        Session session=SessionUtil.getSession();
        session.getTransaction().begin();
        Names mem=new Names();
        mem.setName(member);
        session.save(mem);
        session.getTransaction().commit();
    }
}
