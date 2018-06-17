package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by neeraj on 17/06/18.
 */
public class CategoryDao {
    public List<Category> getAllCategories() {
        try {
            Session session = SessionUtil.getSession();
            Query query = session.createQuery("from Category");

            List<Category> categoryList = query.list();
            session.close();
            return categoryList;

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
