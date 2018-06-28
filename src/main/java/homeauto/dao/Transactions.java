package homeauto.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Transactions")


public class Transactions {
    @Column
    @Id
    private int id;
    @Column
    private double amount;
    @Column(name = "purchase_dt")
    private Date payDate;
    @Column(name = "cat_id")
    private int catId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;

    }

    public int getCatId() {
        return catId;
    }

    public void setCatId() {
        this.catId = catId;
    }

    public homeauto.entities.Transaction getTransactions() {
        return new homeauto.entities.Transaction(id, amount, payDate, catId);
    }
}
