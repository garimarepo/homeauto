package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;


public class TransactionDao {
    public List<Transactions> getAllTransactions() {
        try {
            Session session = SessionUtil.getSession();
            Query query = session.createQuery("from  Transactions");
            List<Transactions> transactionsList = query.list();
            session.close();
            return transactionsList;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
