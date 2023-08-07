package impl;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import entity.Transaction;
import exception.TransactionException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import service.TransactionDao;

public class TransactionDaoImpl implements TransactionDao {
    private Connection connection;
    
    private final String insertTransaction = "INSERT INTO transactions"
                                        + "(transactionCode, userId, showTimeId, bookingSeat, totalPrice, totalPay) "
                                        + "VALUES(?, ?, ?, ?, ?, ?)";
    
    private final String getById = "SELECT * from transactions "
                                    + "WHERE id = ? ";
    
    public TransactionDaoImpl(Connection connction) {
        this.connection = connction;
    }

    @Override
    public void insertTransaction(Transaction transaction) throws TransactionException {
        PreparedStatement statement = null;
        
        try {
            // isi statement dengan query INSERT
            connection.setAutoCommit(false);
            statement =  connection.prepareStatement(insertTransaction, Statement.RETURN_GENERATED_KEYS);
            // mempersiapkan nilai yang akan ditambahkan ke tabel transaction
            statement.setString(1, transaction.getTransactionCode());
            statement.setInt(2, transaction.getUserId());
            statement.setInt(3, transaction.getShowTimeId());
            
            JSONArray jsonBookingSeat = new JSONArray(transaction.getBookingSeat());
            statement.setString(4, jsonBookingSeat.toString());
            
            statement.setInt(5, transaction.getTotalPrice());
            statement.setInt(6, transaction.getTotalPay());
            statement.executeUpdate();
            
            ResultSet result = statement.getGeneratedKeys();
            if(result.next()) {
                transaction.setId(result.getInt(1));
            }
            
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new TransactionException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
    
    @Override
    public Transaction getTransaction(Integer id) throws TransactionException {
        PreparedStatement statement = null;
        
        try {
            // isi statement dengan query SELECT
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Transaction transaction = null;
            // buat validasi untuk mengecek apakah ada record
            if(result.next()) {
                // set hasil query ke object transaction
                transaction = new Transaction();
                transaction.setId(result.getInt("id"));
                transaction.setTransactionCode(result.getString("transactionCode"));
                transaction.setUserId(result.getInt("userId"));
                transaction.setShowTimeId(result.getInt("showTimeId"));
                transaction.setTotalPrice(result.getInt("totalPrice"));
                transaction.setTotalPay(result.getInt("totalPay"));
                transaction.setStatus(result.getString("status"));
                
                JSONArray jsonBookingSeat = new JSONArray(result.getString("bookingSeat"));
                List<String> bookingSeat = new ArrayList<>(jsonBookingSeat.toList().size());
                jsonBookingSeat.toList().forEach((seat) -> {
                    bookingSeat.add(Objects.toString(seat, null));
                });
                
                transaction.setBookingSeat(bookingSeat);
                
                connection.commit();
            } else {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }
                throw new TransactionException("Data Transaction dengan ID = " + id
                        + " Tidak Ditemukan didalam Database");
            }
            
            return transaction;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new TransactionException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
