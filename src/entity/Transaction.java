package entity;

import java.util.List;
import java.util.Objects;

public class Transaction {
    private Integer id;
    private String transactionCode;
    private Integer userId;
    private Integer showTimeId;
    private List<String> bookingSeat; 
    private Integer totalPrice;
    private Integer totalPay;
    private String status = "SUCCESS";
    
    public Transaction() {
        
    }
    
    public Transaction(String transactionCode, Integer userId, Integer showTimeId, List<String> bookingSeat, Integer totalPrice, Integer totalPay, String status) {
        this.transactionCode = transactionCode;
        this.userId = userId;
        this.showTimeId = showTimeId;
        this.bookingSeat = bookingSeat;
        this.totalPrice = totalPrice;
        this.totalPay = totalPay;
        this.status = status;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.transactionCode);
        hash = 59 * hash + Objects.hashCode(this.userId);
        hash = 59 * hash + Objects.hashCode(this.showTimeId);
        hash = 59 * hash + Objects.hashCode(this.bookingSeat);
        hash = 59 * hash + Objects.hashCode(this.totalPrice);
        hash = 59 * hash + Objects.hashCode(this.totalPay);
        hash = 59 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaction other = (Transaction) obj;
        if (!Objects.equals(this.transactionCode, other.transactionCode)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        if (!Objects.equals(this.showTimeId, other.showTimeId)) {
            return false;
        }
        if (!Objects.equals(this.bookingSeat, other.bookingSeat)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        if (!Objects.equals(this.totalPay, other.totalPay)) {
            return false;
        }
        return true;
    }
}
