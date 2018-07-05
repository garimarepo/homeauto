package homeauto.resource;

import homeauto.dao.TransactionDao;
import homeauto.entities.DaoMapping;
import homeauto.entities.Transaction;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("transactions")

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

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List<homeauto.entities.Transaction> getAllTransactions() {

        TransactionDao dao;
        dao = new TransactionDao();
        return DaoMapping.getAllTransactions(dao.getAllTransactions());
    }
    @PUT
    @Path("{amount}/{payDate}")
    @Produces(MediaType.APPLICATION_JSON)
    public void createTransaction(@PathParam("amount") String amount,@PathParam("payDate") String payDate)
    {
        TransactionDao dao=new TransactionDao();
        dao.createTransaction(amount,payDate);
    }

}

