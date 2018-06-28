package homeauto.entities;

import java.util.Date;


public class Transaction {
    int id;
    double amount;
    Date payDate;
    int catId;

    public Transaction(int id, double amount, Date payDate, int catId) {
        this.id = id;
        this.amount = amount;
        this.payDate = payDate;
        this.catId = catId;

    }

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

    public void setCatId(int catId) {
        this.catId = catId;
    }

}
