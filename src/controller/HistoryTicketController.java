package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import model.UserModel;
import view.HistoryTicketPage;

/**
 *
 * @author ariqhikari
 */
public class HistoryTicketController {
    private UserModel user;
    private Movie movie;
    private Showtime showtime;
    private Transaction transaction;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

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
    
    public void setDetail(HistoryTicketPage historyTicketPage)  {
        historyTicketPage.getjLabelTitle().setText(movie.getTitle());
        historyTicketPage.getjLabelGenre().setText(movie.getGenresString());
        historyTicketPage.getjLabelRating().setText(Double.toString(movie.getRating()));
        
        int rating = (int) movie.getRating();
        if(rating >= 1) {
            historyTicketPage.getStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star-fill.png")));
        }
        if(rating >= 2) {
            historyTicketPage.getStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star-fill.png")));
        }
        if(rating >= 3) {
            historyTicketPage.getStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star-fill.png")));
        }
        if(rating >= 4) {
            historyTicketPage.getStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star-fill.png")));
        }
        if(rating >= 5) {
            historyTicketPage.getStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star-fill.png")));
        }
        
        String dateTime = getDate(new Date()) + ", " + showtime.getTime().toString();
        historyTicketPage.getjLabelDateTime().setText(dateTime);
        
        historyTicketPage.getjLabelSeat().setText(String.join(", ", transaction.getBookingSeat()));
        historyTicketPage.getjLabelCode().setText(transaction.getTransactionCode());
        historyTicketPage.getjLabelName().setText(user.getName());
        historyTicketPage.getjLabelTotalPrice().setText(getCurrency(transaction.getTotalPrice()));
        historyTicketPage.getjLabelTotalPay().setText(getCurrency(transaction.getTotalPay()));
        historyTicketPage.getjLabelKembalian().setText(getCurrency(transaction.getTotalPay() - transaction.getTotalPrice()));
    }
    
    public String getDate(Date date) {        
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateFormat = simpleDateFormat.format(date);
        
        return dateFormat;
    }
    
    public String getCurrency(int number) {
        Locale id = new Locale("id", "ID");
        Currency rupiah = Currency.getInstance(id);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(id);
        String priceString = formatter.format(Double.valueOf(number));
        
        return priceString;
    }
}
