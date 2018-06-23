package homeauto.resource;

import homeauto.entities.Transaction;

import java.util.List;


public class ResourceTransaction {
    public int add(Transaction transaction) {
        return 0;
    }

    public boolean update(int id, Transaction transaction) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }

    public List<Transaction> getAllTransactions() {
        return null;
    }
}

