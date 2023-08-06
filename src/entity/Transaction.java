package entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ariqhikari
 */
public class Transaction {
    private Integer id;
    private String transactionCode;
    private Integer userId;
    private Integer showTimeId;
    private List<String> bookingSeat; 
    private Integer totalCost;
    private String status;
    
    public Transaction() {
        
    }
    
    public Transaction(String transactionCode, Integer userId, Integer showTimeId, List<String> bookingSeat, Integer totalCost, String status) {
        this.transactionCode = transactionCode;
        this.userId = userId;
        this.showTimeId = showTimeId;
        this.bookingSeat = bookingSeat;
        this.totalCost = totalCost;
        this.status = status;;
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

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.transactionCode);
        hash = 41 * hash + Objects.hashCode(this.userId);
        hash = 41 * hash + Objects.hashCode(this.showTimeId);
        hash = 41 * hash + Objects.hashCode(this.bookingSeat);
        hash = 41 * hash + Objects.hashCode(this.totalCost);
        hash = 41 * hash + Objects.hashCode(this.status);
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
        if (!Objects.equals(this.totalCost, other.totalCost)) {
            return false;
        }
        return true;
    }
    
    
}
