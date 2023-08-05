package view;

import controller.SeatController;
import database.CinemaDB;
import entity.Showtime;
import exception.ShowtimeException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import service.ShowtimeDao;

public class SeatPage extends javax.swing.JPanel {
    MainWindow window;
    SeatController controller;
    
    /**
     * Creates new form SeatPage
     */
    public SeatPage(MainWindow window) {
        this.window = window;
        controller = new SeatController();
        
        initComponents();
    }

    public JPanel getPanelSeat() {
        return panelSeat;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeat = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        seatF6 = new javax.swing.JLabel();
        seatF5 = new javax.swing.JLabel();
        seatF4 = new javax.swing.JLabel();
        seatF3 = new javax.swing.JLabel();
        seatF2 = new javax.swing.JLabel();
        seatF1 = new javax.swing.JLabel();
        seatE8 = new javax.swing.JLabel();
        seatE7 = new javax.swing.JLabel();
        seatE6 = new javax.swing.JLabel();
        seatE5 = new javax.swing.JLabel();
        seatE4 = new javax.swing.JLabel();
        seatE3 = new javax.swing.JLabel();
        seatE2 = new javax.swing.JLabel();
        seatE1 = new javax.swing.JLabel();
        seatD8 = new javax.swing.JLabel();
        seatD7 = new javax.swing.JLabel();
        seatD6 = new javax.swing.JLabel();
        seatD5 = new javax.swing.JLabel();
        seatD4 = new javax.swing.JLabel();
        seatD3 = new javax.swing.JLabel();
        seatD2 = new javax.swing.JLabel();
        seatD1 = new javax.swing.JLabel();
        seatC9 = new javax.swing.JLabel();
        seatC8 = new javax.swing.JLabel();
        seatC7 = new javax.swing.JLabel();
        seatC6 = new javax.swing.JLabel();
        seatC5 = new javax.swing.JLabel();
        seatC4 = new javax.swing.JLabel();
        seatC3 = new javax.swing.JLabel();
        seatC2 = new javax.swing.JLabel();
        seatC1 = new javax.swing.JLabel();
        seatB9 = new javax.swing.JLabel();
        seatB8 = new javax.swing.JLabel();
        seatB7 = new javax.swing.JLabel();
        seatB6 = new javax.swing.JLabel();
        seatB5 = new javax.swing.JLabel();
        seatB4 = new javax.swing.JLabel();
        seatB3 = new javax.swing.JLabel();
        seatB2 = new javax.swing.JLabel();
        seatB1 = new javax.swing.JLabel();
        seatA9 = new javax.swing.JLabel();
        seatA8 = new javax.swing.JLabel();
        seatA7 = new javax.swing.JLabel();
        seatA6 = new javax.swing.JLabel();
        seatA5 = new javax.swing.JLabel();
        seatA4 = new javax.swing.JLabel();
        seatA3 = new javax.swing.JLabel();
        seatA2 = new javax.swing.JLabel();
        seatA1 = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        availableSeat = new javax.swing.JLabel();
        reservedSeat = new javax.swing.JLabel();
        selectedSeat = new javax.swing.JLabel();
        seat = new javax.swing.JLabel();
        tiketMerah = new javax.swing.JLabel();
        txtSeat = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        keranjangMerah = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        buyBtn = new javax.swing.JLabel();
        base = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelSeat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        panelSeat.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, -1, -1));

        seatF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        seatF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        seatF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        seatF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        seatF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        seatF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        seatE8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        seatE7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        seatE6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        seatE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        seatE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        seatE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        seatE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        seatE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        seatD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        seatD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        seatD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        seatD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        seatD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        seatD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        seatD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        seatD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        seatC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        seatC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, -1, -1));

        seatC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        seatC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        seatC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        seatC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        seatC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        seatC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        seatC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        seatB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, -1));

        seatB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        seatB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        seatB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        seatB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        seatB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        seatB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        seatB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        seatB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        seatA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        seatA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        seatA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, -1, -1));

        seatA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        seatA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        seatA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        seatA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        panelSeat.add(seatA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        seatA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatA2MouseClicked(evt);
            }
        });
        panelSeat.add(seatA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, -1));

        seatA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatA1MouseClicked(evt);
            }
        });
        panelSeat.add(seatA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

        screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Screen.png"))); // NOI18N
        panelSeat.add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Choose Seats Five Cinema.png"))); // NOI18N
        panelSeat.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        availableSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/status-available-seat.png"))); // NOI18N
        panelSeat.add(availableSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, -1, -1));

        reservedSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/status-reserved-seat.png"))); // NOI18N
        panelSeat.add(reservedSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, -1, -1));

        selectedSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/status-selected-seat.png"))); // NOI18N
        panelSeat.add(selectedSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        seat.setBackground(new java.awt.Color(255, 255, 255));
        seat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        seat.setForeground(new java.awt.Color(251, 65, 65));
        seat.setText("Seat");
        panelSeat.add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 60, 30));

        tiketMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TicketRed.png"))); // NOI18N
        panelSeat.add(tiketMerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, -1, -1));

        txtSeat.setBorder(null);
        panelSeat.add(txtSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 90, 30));
        txtSeat.setBackground(new java.awt.Color(0,0,0,1));

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        total.setForeground(new java.awt.Color(251, 65, 65));
        total.setText("Total");
        panelSeat.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 730, 60, 30));

        keranjangMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Buy.png"))); // NOI18N
        panelSeat.add(keranjangMerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 720, -1, -1));

        txtTotal.setBorder(null);
        panelSeat.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 730, 90, 30));
        txtTotal.setBackground(new java.awt.Color(0,0,0,1));

        buyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Buy button.png"))); // NOI18N
        panelSeat.add(buyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, -1, -1));

        base.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Base.png"))); // NOI18N
        panelSeat.add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 655, 360, 140));

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pilih kursi.png"))); // NOI18N
        panelSeat.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(panelSeat, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void seatA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seatA2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA2MouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        try {
            // TODO add your handling code here:
            window.getWindowController().tampilHalamanDetailMovie(window, controller.getMovie());
        } catch (IOException ex) {
            Logger.getLogger(SeatPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackMouseClicked

    public SeatController getController() {
        return controller;
    }

    private void seatA1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    
    public void loadDatabase(int movieId, LocalTime time) throws SQLException, ShowtimeException {
        ShowtimeDao dao = CinemaDB.getShowtime();
        Showtime showtime = dao.getShowtime(movieId, time);
        controller.setShowtime(showtime);
        System.out.println(showtime.getSeats().toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableSeat;
    private javax.swing.JLabel background;
    private javax.swing.JLabel base;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel buyBtn;
    private javax.swing.JLabel keranjangMerah;
    private javax.swing.JPanel panelSeat;
    private javax.swing.JLabel reservedSeat;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel seat;
    private javax.swing.JLabel seatA1;
    private javax.swing.JLabel seatA2;
    private javax.swing.JLabel seatA3;
    private javax.swing.JLabel seatA4;
    private javax.swing.JLabel seatA5;
    private javax.swing.JLabel seatA6;
    private javax.swing.JLabel seatA7;
    private javax.swing.JLabel seatA8;
    private javax.swing.JLabel seatA9;
    private javax.swing.JLabel seatB1;
    private javax.swing.JLabel seatB2;
    private javax.swing.JLabel seatB3;
    private javax.swing.JLabel seatB4;
    private javax.swing.JLabel seatB5;
    private javax.swing.JLabel seatB6;
    private javax.swing.JLabel seatB7;
    private javax.swing.JLabel seatB8;
    private javax.swing.JLabel seatB9;
    private javax.swing.JLabel seatC1;
    private javax.swing.JLabel seatC2;
    private javax.swing.JLabel seatC3;
    private javax.swing.JLabel seatC4;
    private javax.swing.JLabel seatC5;
    private javax.swing.JLabel seatC6;
    private javax.swing.JLabel seatC7;
    private javax.swing.JLabel seatC8;
    private javax.swing.JLabel seatC9;
    private javax.swing.JLabel seatD1;
    private javax.swing.JLabel seatD2;
    private javax.swing.JLabel seatD3;
    private javax.swing.JLabel seatD4;
    private javax.swing.JLabel seatD5;
    private javax.swing.JLabel seatD6;
    private javax.swing.JLabel seatD7;
    private javax.swing.JLabel seatD8;
    private javax.swing.JLabel seatE1;
    private javax.swing.JLabel seatE2;
    private javax.swing.JLabel seatE3;
    private javax.swing.JLabel seatE4;
    private javax.swing.JLabel seatE5;
    private javax.swing.JLabel seatE6;
    private javax.swing.JLabel seatE7;
    private javax.swing.JLabel seatE8;
    private javax.swing.JLabel seatF1;
    private javax.swing.JLabel seatF2;
    private javax.swing.JLabel seatF3;
    private javax.swing.JLabel seatF4;
    private javax.swing.JLabel seatF5;
    private javax.swing.JLabel seatF6;
    private javax.swing.JLabel selectedSeat;
    private javax.swing.JLabel tiketMerah;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
