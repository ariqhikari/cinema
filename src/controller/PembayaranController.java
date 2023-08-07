package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import model.TransactionModel;
import view.MainWindow;
import view.PembayaranPage;

/**
 *
 * @author ariqhikari
 */
public class PembayaranController {
    private Movie movie;
    private Showtime showtime;
    private Transaction transaction;
    private TransactionModel model;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public TransactionModel getModel() {
        return model;
    }

    public void setModel(TransactionModel model) {
        this.model = model;
    }
    
    public void setDetail(PembayaranPage pembayaranPage) {
        pembayaranPage.getTxtDetailPembelian().setText(movie.getTitle());
        pembayaranPage.getTxtTotalHarga().setText(getPriceString(transaction.getTotalPrice()));
    }
    
    public String getPriceString(int price) {
        Locale id = new Locale("id", "ID");
        Currency rupiah = Currency.getInstance(id);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(id);
        String priceString = formatter.format(Double.valueOf(price));
        
        return priceString;
    }
    
    public void hitungKembalian(PembayaranPage pembayaranPage) {
        if(pembayaranPage.getTxtTotalBayar().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembayaranPage, "ISI TOTAL BAYAR TERLEBIH DAHULU");
            return;
        }
        
        int kembalian = Integer.valueOf(pembayaranPage.getTxtTotalBayar().getText()) - transaction.getTotalPrice();
        
        if(kembalian < 0) {
            JOptionPane.showMessageDialog(pembayaranPage, "TOTAL BAYAR TIDAK MENCUKUPI");
            return;
        } 
        
        pembayaranPage.getTxtKembalian().setText(getPriceString(kembalian));
    }
    
    public void printTiket(MainWindow window, PembayaranPage pembayaranPage) {
        if(pembayaranPage.getTxtTotalBayar().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembayaranPage, "ISI TOTAL BAYAR TERLEBIH DAHULU");
            return;
        }
        
        if(pembayaranPage.getTxtKembalian().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembayaranPage, "HITUNG KEMBALIAN TERLEBIH DAHULU");
            return;
        }
        
        int kembalian = Integer.valueOf(pembayaranPage.getTxtTotalBayar().getText()) - transaction.getTotalPrice();
        
        if(kembalian < 0) {
            JOptionPane.showMessageDialog(pembayaranPage, "TOTAL BAYAR TIDAK MENCUKUPI");
            return;
        } 
        
        // insert transaction
        transaction.setTransactionCode("CODE-" + generateRandomNumber(000, 99999999));
        transaction.setTotalPay(Integer.valueOf(pembayaranPage.getTxtTotalBayar().getText()));
        
        model.setTransactionCode(transaction.getTransactionCode());
        model.setUserId(transaction.getUserId());
        model.setShowTimeId(transaction.getShowTimeId());
        model.setBookingSeat(transaction.getBookingSeat());
        model.setTotalPrice(transaction.getTotalPrice());
        model.setTotalPay(transaction.getTotalPay());
        
        Map<String, Object> seats = showtime.getSeats();
        transaction.getBookingSeat().forEach((seat) -> { 
            seats.put(seat, true);
        });
        showtime.setSeats(seats);
            
        try {
            model.insertTransaction(showtime);
            JOptionPane.showMessageDialog(window, "DATA TRANSACTION BERHASIL DISIMPAN");
            window.getWindowController().tampilHalamanDetailTiket(window, movie, showtime, transaction);            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(window, new Object[]{
                "TERJADI ERROR DI DATABASE DENGAN PESAN ", ex.getMessage()
            });
        }
    }
    
    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}