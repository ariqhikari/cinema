package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import view.MainWindow;
import view.SeatPage;

public class SeatController {
    private Movie movie;
    private Showtime showtime;
    private List<String> selectedSeats;
    private int totalPrice = 0;
    private Map<String, JLabel> seatsMap;
        
    public SeatController(SeatPage seatPage) {
        this.selectedSeats = new ArrayList<>();
        this.seatsMap = getSeatsMap(seatPage);
        for (Map.Entry<String,JLabel> seat : seatsMap.entrySet()) {
            seat.getValue().addMouseListener(getMouseAdapter(seatPage));
        }
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

    public void setShowtime(SeatPage seatPage, Showtime showtime) {
        this.showtime = showtime;
        setSeat(seatPage);
        setDetail(seatPage);
    }
    
    public void setDetail(SeatPage seatPage) {
        seatPage.getjLabelDate().setText(getDate(new Date()));
        seatPage.getjLabelTime().setText(showtime.getTime().toString());
        seatPage.getjLabelSelectedSeats().setText(String.join(", ", selectedSeats));
        seatPage.getjLabelTotal().setText(getPriceString(totalPrice));
    }
    
    public String getDate(Date date) {        
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateFormat = simpleDateFormat.format(date);
        
        return dateFormat;
    }
    
    public String getPriceString(int price) {
        Locale id = new Locale("id", "ID");
        Currency rupiah = Currency.getInstance(id);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(id);
        String priceString = formatter.format(Double.valueOf(price));
        
        return priceString;
    }
    
    public Map<String, JLabel> getSeatsMap(SeatPage seatPage) {
        // A1 A9 - C9
        // D1 D8 - E8
        // F1 F6
        Map<String, JLabel> seatsMap = new HashMap<>();
        seatsMap.put("A1", seatPage.getSeatA1());
        seatsMap.put("A2", seatPage.getSeatA2());
        seatsMap.put("A3", seatPage.getSeatA3());
        seatsMap.put("A4", seatPage.getSeatA4());
        seatsMap.put("A5", seatPage.getSeatA5());
        seatsMap.put("A6", seatPage.getSeatA6());
        seatsMap.put("A7", seatPage.getSeatA7());
        seatsMap.put("A8", seatPage.getSeatA8());
        seatsMap.put("A9", seatPage.getSeatA9());
        
        seatsMap.put("B1", seatPage.getSeatB1());
        seatsMap.put("B2", seatPage.getSeatB2());
        seatsMap.put("B3", seatPage.getSeatB3());
        seatsMap.put("B4", seatPage.getSeatB4());
        seatsMap.put("B5", seatPage.getSeatB5());
        seatsMap.put("B6", seatPage.getSeatB6());
        seatsMap.put("B7", seatPage.getSeatB7());
        seatsMap.put("B8", seatPage.getSeatB8());
        seatsMap.put("B9", seatPage.getSeatB9());
        
        seatsMap.put("C1", seatPage.getSeatC1());
        seatsMap.put("C2", seatPage.getSeatC2());
        seatsMap.put("C3", seatPage.getSeatC3());
        seatsMap.put("C4", seatPage.getSeatC4());
        seatsMap.put("C5", seatPage.getSeatC5());
        seatsMap.put("C6", seatPage.getSeatC6());
        seatsMap.put("C7", seatPage.getSeatC7());
        seatsMap.put("C8", seatPage.getSeatC8());
        seatsMap.put("C9", seatPage.getSeatC9());
        
        seatsMap.put("D1", seatPage.getSeatD1());
        seatsMap.put("D2", seatPage.getSeatD2());
        seatsMap.put("D3", seatPage.getSeatD3());
        seatsMap.put("D4", seatPage.getSeatD4());
        seatsMap.put("D5", seatPage.getSeatD5());
        seatsMap.put("D6", seatPage.getSeatD6());
        seatsMap.put("D7", seatPage.getSeatD7());
        seatsMap.put("D8", seatPage.getSeatD8());
        
        seatsMap.put("E1", seatPage.getSeatE1());
        seatsMap.put("E2", seatPage.getSeatE2());
        seatsMap.put("E3", seatPage.getSeatE3());
        seatsMap.put("E4", seatPage.getSeatE4());
        seatsMap.put("E5", seatPage.getSeatE5());
        seatsMap.put("E6", seatPage.getSeatE6());
        seatsMap.put("E7", seatPage.getSeatE7());
        seatsMap.put("E8", seatPage.getSeatE8());
        
        seatsMap.put("F1", seatPage.getSeatF1());
        seatsMap.put("F2", seatPage.getSeatF2());
        seatsMap.put("F3", seatPage.getSeatF3());
        seatsMap.put("F4", seatPage.getSeatF4());
        seatsMap.put("F5", seatPage.getSeatF5());
        seatsMap.put("F6", seatPage.getSeatF6());
        
        return seatsMap;
    }
    
    public void setSeat(SeatPage seatPage) {
        // A1 A9 - C9
        // D1 D8 - E8
        // F1 F6         
        for (Map.Entry<String,Object> entry : showtime.getSeats().entrySet()) {
            JLabel seat = seatsMap.get(entry.getKey());
            if(showtime.getSeats().get(entry.getKey()).equals(true)) {
                seat.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                seat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reserved seat.png")));
            }
        }
    }
    
    public MouseAdapter getMouseAdapter(SeatPage seatPage) {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String seatKey = ((JLabel)me.getSource()).getToolTipText();
                JLabel seat = seatsMap.get(seatKey);
                if(showtime.getSeats().get(seatKey).equals(true)) {
                        return;
                }
                        
                if(selectedSeats.contains(seatKey)) {
                    selectedSeats.remove(seatKey);
                    seat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png")));
                } else {
                    selectedSeats.add(seatKey);
                    seat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/selected seat.png")));
                }        
                totalPrice = movie.getPrice() * selectedSeats.size();
                setDetail(seatPage);
            } 
        };
    }
    
    public void buyTicket(MainWindow window) {
        if(selectedSeats.isEmpty()) {
            JOptionPane.showMessageDialog(window, "PILIH KURSI TERLEBIH DAHULU");
        } else {
           Transaction transaction = new Transaction();
           transaction.setUserId(window.getModel().getId());
           transaction.setShowTimeId(showtime.getId());
           transaction.setBookingSeat(selectedSeats);
           transaction.setTotalPrice(totalPrice);
           
           window.getWindowController().tampilHalamanPembayaran(window, movie, showtime, transaction);
        }
    }
    
    public void clearData(SeatPage seatPage) {
        Map<String, JLabel> seatsMap = getSeatsMap(seatPage);
                
        for (Map.Entry<String,Object> entry : showtime.getSeats().entrySet()) {
            JLabel seat = seatsMap.get(entry.getKey());
            seat.setCursor(new Cursor(Cursor.HAND_CURSOR));
            seat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png")));
        }
        
        movie = null;
        showtime = null;
        selectedSeats = new ArrayList<>();
        totalPrice = 0;
        seatPage.getjLabelDate().setText(getDate(new Date()));
        seatPage.getjLabelTime().setText("");
        seatPage.getjLabelSelectedSeats().setText("");
        seatPage.getjLabelTotal().setText("");
    }
}
