package homeauto.dao;

import homeauto.resource.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Date;
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
    public void createTransaction(double amount,Date payDate)
    {
        Session session=SessionUtil.getSession();
        session.getTransaction().begin();
        Names mem=new Names();
        Transactions t=new Transactions();
        mem.setName(member);
        t.setName
        session.save(mem);
        session.getTransaction().commit();
    }
}
