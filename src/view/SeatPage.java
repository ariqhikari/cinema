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
import javax.swing.JLabel;
import javax.swing.JPanel;
import service.ShowtimeDao;

public class SeatPage extends javax.swing.JPanel {
    MainWindow window;
    SeatController controller;
    
    /**
     * Creates new form SeatPage
     * @param window
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
        tiketMerah1 = new javax.swing.JLabel();
        total6 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        jLabelSelectedSeats = new javax.swing.JLabel();
        tiketMerah = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        keranjangMerah = new javax.swing.JLabel();
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
        seatF6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        seatF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatF5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        seatF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatF4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        seatF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatF3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        seatF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatF2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        seatF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatF1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        seatE8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        seatE7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        seatE6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        seatE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        seatE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        seatE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        seatE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        seatE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        seatD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        seatD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        seatD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        seatD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        seatD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        seatD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        seatD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        seatD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        seatC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        seatC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, -1, -1));

        seatC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        seatC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        seatC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        seatC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        seatC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        seatC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        seatC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        seatB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, -1));

        seatB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        seatB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        seatB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        seatB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        seatB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        seatB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        seatB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        seatB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        seatA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        seatA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        seatA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, -1, -1));

        seatA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        seatA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        seatA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        seatA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSeat.add(seatA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        seatA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seatA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatA2MouseClicked(evt);
            }
        });
        panelSeat.add(seatA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, -1));

        seatA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/available seat.png"))); // NOI18N
        seatA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        tiketMerah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calendar.png"))); // NOI18N
        panelSeat.add(tiketMerah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, -1, -1));

        total6.setBackground(new java.awt.Color(255, 255, 255));
        total6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        total6.setForeground(new java.awt.Color(251, 65, 65));
        total6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/separator-circle.png"))); // NOI18N
        panelSeat.add(total6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 670, 10, 40));

        jLabelDate.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDate.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(251, 65, 65));
        jLabelDate.setText("05 August 2023");
        panelSeat.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 130, 40));

        jLabelTime.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTime.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(251, 65, 65));
        jLabelTime.setText("10:00");
        panelSeat.add(jLabelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 90, 40));

        total3.setBackground(new java.awt.Color(255, 255, 255));
        total3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        total3.setForeground(new java.awt.Color(251, 65, 65));
        total3.setText("Seat:");
        panelSeat.add(total3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 710, 50, 40));

        jLabelSelectedSeats.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSelectedSeats.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelSelectedSeats.setForeground(new java.awt.Color(251, 65, 65));
        panelSeat.add(jLabelSelectedSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 180, 40));

        tiketMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ticket_1.png"))); // NOI18N
        panelSeat.add(tiketMerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 720, -1, -1));

        jLabelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(251, 65, 65));
        jLabelTotal.setText("Rp 0");
        panelSeat.add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 750, 180, 40));

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        total.setForeground(new java.awt.Color(251, 65, 65));
        total.setText("Total:");
        panelSeat.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 750, 50, 40));

        keranjangMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buy.png"))); // NOI18N
        panelSeat.add(keranjangMerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 760, -1, -1));

        buyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Buy button.png"))); // NOI18N
        buyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyBtnMouseClicked(evt);
            }
        });
        panelSeat.add(buyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 660, -1, -1));

        base.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Base.png"))); // NOI18N
        panelSeat.add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 440, 140));

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

    private void seatA1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }               
    
    private void buyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyBtnMouseClicked
        // TODO add your handling code here:
        controller.buyTicket(window);
    }//GEN-LAST:event_buyBtnMouseClicked

    public SeatController getController() {
        return controller;
    }
    
    public void loadDatabase(int movieId, LocalTime time) throws SQLException, ShowtimeException {
        ShowtimeDao dao = CinemaDB.getShowtime();
        Showtime showtime = dao.getShowtime(movieId, time);
        controller.setShowtime(showtime); 
        controller.setSeat(this);
        controller.setDetail(this);
    }

    public JLabel getSeatA1() {
        return seatA1;
    }

    public JLabel getSeatA2() {
        return seatA2;
    }

    public JLabel getSeatA3() {
        return seatA3;
    }

    public JLabel getSeatA4() {
        return seatA4;
    }

    public JLabel getSeatA5() {
        return seatA5;
    }

    public JLabel getSeatA6() {
        return seatA6;
    }

    public JLabel getSeatA7() {
        return seatA7;
    }

    public JLabel getSeatA8() {
        return seatA8;
    }

    public JLabel getSeatA9() {
        return seatA9;
    }

    public JLabel getSeatB1() {
        return seatB1;
    }

    public JLabel getSeatB2() {
        return seatB2;
    }

    public JLabel getSeatB3() {
        return seatB3;
    }

    public JLabel getSeatB4() {
        return seatB4;
    }

    public JLabel getSeatB5() {
        return seatB5;
    }

    public JLabel getSeatB6() {
        return seatB6;
    }

    public JLabel getSeatB7() {
        return seatB7;
    }

    public JLabel getSeatB8() {
        return seatB8;
    }

    public JLabel getSeatB9() {
        return seatB9;
    }

    public JLabel getSeatC1() {
        return seatC1;
    }

    public JLabel getSeatC2() {
        return seatC2;
    }

    public JLabel getSeatC3() {
        return seatC3;
    }

    public JLabel getSeatC4() {
        return seatC4;
    }

    public JLabel getSeatC5() {
        return seatC5;
    }

    public JLabel getSeatC6() {
        return seatC6;
    }

    public JLabel getSeatC7() {
        return seatC7;
    }

    public JLabel getSeatC8() {
        return seatC8;
    }

    public JLabel getSeatC9() {
        return seatC9;
    }

    public JLabel getSeatD1() {
        return seatD1;
    }

    public JLabel getSeatD2() {
        return seatD2;
    }

    public JLabel getSeatD3() {
        return seatD3;
    }

    public JLabel getSeatD4() {
        return seatD4;
    }

    public JLabel getSeatD5() {
        return seatD5;
    }

    public JLabel getSeatD6() {
        return seatD6;
    }

    public JLabel getSeatD7() {
        return seatD7;
    }

    public JLabel getSeatD8() {
        return seatD8;
    }

    public JLabel getSeatE1() {
        return seatE1;
    }

    public JLabel getSeatE2() {
        return seatE2;
    }

    public JLabel getSeatE3() {
        return seatE3;
    }

    public JLabel getSeatE4() {
        return seatE4;
    }

    public JLabel getSeatE5() {
        return seatE5;
    }

    public JLabel getSeatE6() {
        return seatE6;
    }

    public JLabel getSeatE7() {
        return seatE7;
    }

    public JLabel getSeatE8() {
        return seatE8;
    }

    public JLabel getSeatF1() {
        return seatF1;
    }

    public JLabel getSeatF2() {
        return seatF2;
    }

    public JLabel getSeatF3() {
        return seatF3;
    }

    public JLabel getSeatF4() {
        return seatF4;
    }

    public JLabel getSeatF5() {
        return seatF5;
    }

    public JLabel getSeatF6() {
        return seatF6;
    }

    public JLabel getjLabelDate() {
        return jLabelDate;
    }

    public JLabel getjLabelSelectedSeats() {
        return jLabelSelectedSeats;
    }

    public JLabel getjLabelTime() {
        return jLabelTime;
    }

    public JLabel getjLabelTotal() {
        return jLabelTotal;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableSeat;
    private javax.swing.JLabel background;
    private javax.swing.JLabel base;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel buyBtn;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelSelectedSeats;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel keranjangMerah;
    private javax.swing.JPanel panelSeat;
    private javax.swing.JLabel reservedSeat;
    private javax.swing.JLabel screen;
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
    private javax.swing.JLabel tiketMerah1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total3;
    private javax.swing.JLabel total6;
    // End of variables declaration//GEN-END:variables
}
