package service;

import entity.Transaction;
import exception.TransactionException;

public interface TransactionDao {
    public void insertTransaction(Transaction transaction) throws TransactionException;
    public Transaction getTransaction(Integer id) throws TransactionException;
}
