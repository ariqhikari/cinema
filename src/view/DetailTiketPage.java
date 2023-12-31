package view;

import controller.DetailTiketController;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailTiketPage extends javax.swing.JPanel {
    MainWindow window;
    DetailTiketController controller;

    /**
     * Creates new form DetailTiketView
     * @param window
     */
    public DetailTiketPage(MainWindow window) {
        this.window = window;
        controller = new DetailTiketController();
        
        initComponents();
    }
    
    public DetailTiketController getController() {
        return controller;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetailTiket = new javax.swing.JPanel();
        panelPoster = new javax.swing.JPanel();
        jLabelPoster = new javax.swing.JLabel();
        LabelStudio = new javax.swing.JLabel();
        jLabelJumlahTiket = new javax.swing.JLabel();
        jLabelKursi = new javax.swing.JLabel();
        jLabelDateTime = new javax.swing.JLabel();
        LabelFiveCinema = new javax.swing.JLabel();
        LabelKodeBooking = new javax.swing.JLabel();
        jLabelKodeBooking = new javax.swing.JLabel();
        jLabelTitleMovie = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        labelPutih = new javax.swing.JLabel();
        jLabelBg = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelDetailTiket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPoster.setLayout(new java.awt.CardLayout());

        jLabelPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/poster-movie.jpeg"))); // NOI18N
        panelPoster.add(jLabelPoster, "card2");

        panelDetailTiket.add(panelPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        LabelStudio.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        LabelStudio.setForeground(new java.awt.Color(255, 255, 255));
        LabelStudio.setText("UNIKOM MALL, REGULAR, STUDIO 5");
        panelDetailTiket.add(LabelStudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabelJumlahTiket.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelJumlahTiket.setForeground(new java.awt.Color(59, 131, 198));
        jLabelJumlahTiket.setText("2 tiket");
        panelDetailTiket.add(jLabelJumlahTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, -1));

        jLabelKursi.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelKursi.setForeground(new java.awt.Color(198, 59, 59));
        jLabelKursi.setText("E5, E6");
        panelDetailTiket.add(jLabelKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 220, -1));

        jLabelDateTime.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelDateTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDateTime.setText("19 Juli 2023 10:00");
        panelDetailTiket.add(jLabelDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        LabelFiveCinema.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        LabelFiveCinema.setForeground(new java.awt.Color(255, 255, 255));
        LabelFiveCinema.setText("Five Cinema");
        panelDetailTiket.add(LabelFiveCinema, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        LabelKodeBooking.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelKodeBooking.setForeground(new java.awt.Color(59, 131, 198));
        LabelKodeBooking.setText("Kode Booking");
        panelDetailTiket.add(LabelKodeBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        jLabelKodeBooking.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelKodeBooking.setForeground(new java.awt.Color(198, 59, 59));
        jLabelKodeBooking.setText("99883");
        panelDetailTiket.add(jLabelKodeBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 220, -1));

        jLabelTitleMovie.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabelTitleMovie.setForeground(new java.awt.Color(252, 255, 116));
        jLabelTitleMovie.setText("Barbie");
        panelDetailTiket.add(jLabelTitleMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Arrow Right.png"))); // NOI18N
        btnNext.setToolTipText("Next");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        panelDetailTiket.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        panelDetailTiket.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelPutih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rectangle 745 (1).png"))); // NOI18N
        panelDetailTiket.add(labelPutih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 1100, 230));

        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-description.png"))); // NOI18N
        panelDetailTiket.add(jLabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(panelDetailTiket, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        window.getWindowController().tampilHalamanHistoryTicket(window, controller.getMovie(), controller.getShowtime(), controller.getTransaction());
    }//GEN-LAST:event_btnNextMouseClicked

    public JPanel getPanelDetailTiket() {
        return panelDetailTiket;
    }

    public JLabel getLabelKodeBooking() {
        return LabelKodeBooking;
    }

    public JLabel getjLabelDateTime() {
        return jLabelDateTime;
    }

    public JLabel getjLabelJumlahTiket() {
        return jLabelJumlahTiket;
    }

    public JLabel getjLabelKodeBooking() {
        return jLabelKodeBooking;
    }

    public JLabel getjLabelKursi() {
        return jLabelKursi;
    }

    public JLabel getjLabelPoster() {
        return jLabelPoster;
    }

    public JLabel getjLabelTitleMovie() {
        return jLabelTitleMovie;
    }

    public JPanel getPanelPoster() {
        return panelPoster;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFiveCinema;
    private javax.swing.JLabel LabelKodeBooking;
    private javax.swing.JLabel LabelStudio;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelDateTime;
    private javax.swing.JLabel jLabelJumlahTiket;
    private javax.swing.JLabel jLabelKodeBooking;
    private javax.swing.JLabel jLabelKursi;
    private javax.swing.JLabel jLabelPoster;
    private javax.swing.JLabel jLabelTitleMovie;
    private javax.swing.JLabel labelPutih;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelDetailTiket;
    private javax.swing.JPanel panelPoster;
    // End of variables declaration//GEN-END:variables
}
