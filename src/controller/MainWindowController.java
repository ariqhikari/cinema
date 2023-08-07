package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import exception.MovieException;
import exception.ShowtimeException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.BerandaPage;
import view.DetailMoviePage;
import view.DetailTiketPage;
import view.HistoryTicketPage;
import view.MainWindow;
import view.PembayaranPage;
import view.SeatPage;

public class MainWindowController {
    private BerandaPage berandaPage;
    private DetailMoviePage detailMoviePage;
    private SeatPage seatPage;
    private PembayaranPage pembayaranPage;
    private DetailTiketPage detailTiketPage;
    private HistoryTicketPage historyTicketPage;

    public void setBerandaPage(BerandaPage berandaPage) {
        this.berandaPage = berandaPage;
    }

    public void setDetailMoviePage(DetailMoviePage detailMoviePage) {
        this.detailMoviePage = detailMoviePage;
    }
    
    public void setSeatPage(SeatPage seatPage) {
        this.seatPage = seatPage;
    }

    public void setPembayaranPage(PembayaranPage pembayaranPage) {
        this.pembayaranPage = pembayaranPage;
    }

    public void setDetailTiketPage(DetailTiketPage detailTiketPage) {
        this.detailTiketPage = detailTiketPage;
    }

    public void setHistoryTicketPage(HistoryTicketPage historyTicketPage) {
        this.historyTicketPage = historyTicketPage;
    }
      
    public void tampilHalamanLogin(MainWindow window) {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(window.getPanelLogin());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
    }
    
    public void tampilHalamanBeranda(MainWindow window)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(berandaPage.getPanelBeranda());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        try {
            berandaPage.loadDatabase();
        } catch (SQLException | MovieException | IOException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void tampilHalamanDetailMovie(MainWindow window, Movie movie) throws IOException  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(detailMoviePage.getPanelDetailMovie());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        detailMoviePage.getController().setMovie(movie);
        detailMoviePage.setViewMovie();
    }
      
    public void tampilHalamanKursi(MainWindow window, Movie movie, LocalTime time)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(seatPage.getPanelSeat());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        try {
            seatPage.getController().setMovie(movie);
            seatPage.loadDatabase(movie.getId(), time);
        } catch (SQLException | ShowtimeException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilHalamanPembayaran(MainWindow window, Movie movie, Showtime showtime, Transaction transaction)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(pembayaranPage.getPanelPembayaran());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        pembayaranPage.getController().setMovie(movie);
        pembayaranPage.getController().setShowtime(showtime);
        pembayaranPage.getController().setTransaction(transaction);
        pembayaranPage.getController().setDetail(pembayaranPage);
    }
    
    public void tampilHalamanDetailTiket(MainWindow window, Movie movie, Showtime showtime, Transaction transaction) throws IOException  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(detailTiketPage.getPanelDetailTiket());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        detailTiketPage.getController().setMovie(movie);
        detailTiketPage.getController().setShowtime(showtime);
        detailTiketPage.getController().setTransaction(transaction);
        detailTiketPage.getController().setDetail(detailTiketPage);
    }
    
    public void tampilHalamanHistoryTicket(MainWindow window, Movie movie, Showtime showtime, Transaction transaction)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(historyTicketPage.getPanelHistory());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        historyTicketPage.getController().setUser(window.getModel());
        historyTicketPage.getController().setMovie(movie);
        historyTicketPage.getController().setShowtime(showtime);
        historyTicketPage.getController().setTransaction(transaction);
        historyTicketPage.getController().setDetail(historyTicketPage);
    }
}