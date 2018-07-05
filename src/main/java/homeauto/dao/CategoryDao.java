package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.transaction.Transactional;
import java.util.List;


public class CategoryDao {
    public List<Category> getAllCategories() {
        try {
            Session session = SessionUtil.getSession();
            Query query = session.createQuery("from Category");

            List<Category> categoryList = query.list();
            session.close();
            return categoryList;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }



    public void createCategory(String name)
    {
        Session session = SessionUtil.getSession();
        session.getTransaction().begin();
        Category cat = new Category();
        cat.setName(name);
        session.save(cat);
        session.getTransaction().commit();

    }

}
