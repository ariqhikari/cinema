package model;

import database.CinemaDB;
import entity.Showtime;
import entity.Transaction;
import event.TransactionListener;
import exception.ShowtimeException;
import exception.TransactionException;
import java.sql.SQLException;
import java.util.List;
import service.ShowtimeDao;
import service.TransactionDao;

/**
 *
 * @author ariqhikari
 */
public class TransactionModel {
    private Integer id;
    private String transactionCode;
    private Integer userId;
    private Integer showTimeId;
    private List<String> bookingSeat; 
    private Integer totalPrice;
    private Integer totalPay;
    private String status = "SUCCESS";
    
    private TransactionListener listener;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShowTimeId() {
        return showTimeId;
    }

    public void setShowTimeId(Integer showTimeId) {
        this.showTimeId = showTimeId;
    }

    public List<String> getBookingSeat() {
        return bookingSeat;
    }

    public void setBookingSeat(List<String> bookingSeat) {
        this.bookingSeat = bookingSeat;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TransactionListener getListener() {
        return listener;
    }

    public void setListener(TransactionListener listener) {
        this.listener = listener;
    }
    
    public void insertTransaction(Showtime showtime) throws SQLException, TransactionException, ShowtimeException {
        TransactionDao transactionDao = CinemaDB.getTransaction();
        ShowtimeDao showtimeDao = CinemaDB.getShowtime();
        Transaction transaction = new Transaction();
        
        transaction.setTransactionCode(this.transactionCode);
        transaction.setUserId(this.userId);
        transaction.setShowTimeId(this.showTimeId);
        transaction.setBookingSeat(this.bookingSeat);
        transaction.setTotalPrice(this.totalPrice);
        transaction.setTotalPay(this.totalPay);
        transaction.setStatus(this.status);
        
        transactionDao.insertTransaction(transaction);
        showtimeDao.updateShowtime(showtime);
        this.fireOnInsert(transaction);
    }
    
    
    protected void fireOnChange() {
        if(listener != null) {
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Transaction transaction) {
        if(listener != null) {
            listener.onInsert(transaction);
        }
    } 
}
