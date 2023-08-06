package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JOptionPane;
import view.PembayaranPage;

/**
 *
 * @author ariqhikari
 */
public class PembayaranController {
    private Movie movie;
    private Showtime showtime;
    private Transaction transaction;

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
    
    public void setDetail(PembayaranPage pembayaranPage) {
        pembayaranPage.getTxtDetailPembelian().setText(movie.getTitle());
        pembayaranPage.getTxtTotalHarga().setText(getPriceString(transaction.getTotalCost()));
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
        
        int kembalian = Integer.valueOf(pembayaranPage.getTxtTotalBayar().getText()) - transaction.getTotalCost();
        
        if(kembalian < 0) {
            JOptionPane.showMessageDialog(pembayaranPage, "TOTAL BAYAR TIDAK MENCUKUPI");
            return;
        } 
        
        pembayaranPage.getTxtKembalian().setText(getPriceString(kembalian));
    }
}
