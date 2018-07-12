package homeauto.dao;

import homeauto.entities.Transaction;
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
    public void createTransaction(Transaction transaction)
    {
        Session session=SessionUtil.getSession();
        session.getTransaction().begin();
        Transactions t=new Transactions();
        t.setAmount(transaction.getAmount());
        t.setPayDate(transaction.getPayDate());
        t.setCatId(transaction.getCatId());
        session.save(t);
        session.getTransaction().commit();
    }
}
