package view;

import controller.HistoryTicketController;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mfari
 */
public class HistoryTicketPage extends javax.swing.JPanel {
    MainWindow window;
    HistoryTicketController controller;
    
    /**
     * Creates new form HistoryTicketPage
     * @param window
     */
    public HistoryTicketPage(MainWindow window) {
        this.window = window;
        controller = new HistoryTicketController();
        
        initComponents();
    }

    public HistoryTicketController getController() {
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

        panelHistory = new javax.swing.JPanel();
        jLabelCircleTop1 = new javax.swing.JLabel();
        jLabelCircleTop3 = new javax.swing.JLabel();
        jLabelCircleBottom4 = new javax.swing.JLabel();
        jLabelCircleBottom3 = new javax.swing.JLabel();
        jLabelCircleBottom2 = new javax.swing.JLabel();
        jLabelCircleBottom1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelRating = new javax.swing.JLabel();
        jLabelStrips = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTotalPay = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();
        jLabelKembalian = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSeat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelDateTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLabelNowPlaying = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        JLabelBg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new java.awt.CardLayout());

        panelHistory.setBackground(new java.awt.Color(255, 255, 255));
        panelHistory.setMaximumSize(new java.awt.Dimension(1200, 32767));
        panelHistory.setPreferredSize(new java.awt.Dimension(1200, 800));
        panelHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCircleTop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-top.png"))); // NOI18N
        panelHistory.add(jLabelCircleTop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 85, -1, -1));

        jLabelCircleTop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-top.png"))); // NOI18N
        panelHistory.add(jLabelCircleTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 85, -1, -1));

        jLabelCircleBottom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-bottom.png"))); // NOI18N
        panelHistory.add(jLabelCircleBottom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 740, -1, -1));

        jLabelCircleBottom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-bottom.png"))); // NOI18N
        panelHistory.add(jLabelCircleBottom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 740, -1, -1));

        jLabelCircleBottom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-bottom.png"))); // NOI18N
        panelHistory.add(jLabelCircleBottom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 740, -1, -1));

        jLabelCircleBottom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/circle-bottom.png"))); // NOI18N
        panelHistory.add(jLabelCircleBottom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 740, -1, -1));

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(505, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRating.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabelRating.setForeground(new java.awt.Color(252, 255, 86));
        jLabelRating.setText("4.6");
        jPanel1.add(jLabelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelStrips.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabelStrips.setText("----------------------------------");
        jPanel1.add(jLabelStrips, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 540, -1));

        jLabelGenre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelGenre.setText("Adventure, Comedy, Fantasy");
        jPanel1.add(jLabelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, 390, -1));

        jLabelTitle.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabelTitle.setText("BARBIE");
        jPanel1.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 40, -1, -1));

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star.png"))); // NOI18N
        jPanel1.add(star2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star.png"))); // NOI18N
        jPanel1.add(star3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star.png"))); // NOI18N
        jPanel1.add(star5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star.png"))); // NOI18N
        jPanel1.add(star4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star.png"))); // NOI18N
        jPanel1.add(star1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabelStatus.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(46, 176, 134));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelStatus.setText("SUCCESS");
        jPanel1.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 130, -1));

        jPanel2.setBackground(new java.awt.Color(190, 185, 185));
        jPanel2.setPreferredSize(new java.awt.Dimension(505, 280));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTotalPay.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelTotalPay.setText("Rp 50.000");
        jPanel2.add(jLabelTotalPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, -1));

        jLabelName.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelName.setText("TIMI");
        jPanel2.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel8.setText("Nama Kasir:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel9.setText("Total Bayar:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel10.setText("Total Harga:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 140, -1));

        jLabelTotalPrice.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelTotalPrice.setText("Rp 40.000");
        jPanel2.add(jLabelTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 170, -1));

        jLabelKembalian.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelKembalian.setText("Rp 10.000");
        jPanel2.add(jLabelKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 180, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel13.setText("Kembalian:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel3.setText("Nomor Kursi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, -1));

        jLabelSeat.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabelSeat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSeat.setText("E5, E6");
        jPanel1.add(jLabelSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(46, 176, 134));
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel6.setText("Kode Booking");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, -1));

        jLabelCode.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCode.setText("CODE-980864");
        jPanel1.add(jLabelCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 270, -1));

        jLabelDateTime.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabelDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDateTime.setText("01 Juli 2023, 10.00");
        jPanel1.add(jLabelDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 270, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel4.setText("Tanggal, Waktu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, -1));

        panelHistory.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 45, -1, -1));

        JLabelNowPlaying.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        JLabelNowPlaying.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNowPlaying.setText("NOW PLAYING");
        JLabelNowPlaying.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelNowPlaying.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelNowPlayingMouseClicked(evt);
            }
        });
        panelHistory.add(JLabelNowPlaying, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 140, -1));

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-menu.png"))); // NOI18N
        panelHistory.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 25, -1, -1));

        JLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-beranda.png"))); // NOI18N
        panelHistory.add(JLabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 820));

        add(panelHistory, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelNowPlayingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelNowPlayingMouseClicked
        // TODO add your handling code here:
        window.getWindowController().tampilHalamanBeranda(window);
    }//GEN-LAST:event_JLabelNowPlayingMouseClicked

    public JPanel getPanelHistory() {
        return panelHistory;
    }
    
    public JLabel getjLabelCode() {
        return jLabelCode;
    }

    public JLabel getjLabelDateTime() {
        return jLabelDateTime;
    }

    public JLabel getjLabelGenre() {
        return jLabelGenre;
    }

    public JLabel getjLabelKembalian() {
        return jLabelKembalian;
    }

    public JLabel getjLabelMenu() {
        return jLabelMenu;
    }

    public JLabel getjLabelName() {
        return jLabelName;
    }

    public JLabel getjLabelRating() {
        return jLabelRating;
    }

    public JLabel getjLabelSeat() {
        return jLabelSeat;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }

    public JLabel getjLabelTitle() {
        return jLabelTitle;
    }

    public JLabel getjLabelTotalPay() {
        return jLabelTotalPay;
    }

    public JLabel getjLabelTotalPrice() {
        return jLabelTotalPrice;
    }

    public JLabel getStar1() {
        return star1;
    }

    public JLabel getStar2() {
        return star2;
    }

    public JLabel getStar3() {
        return star3;
    }

    public JLabel getStar4() {
        return star4;
    }

    public JLabel getStar5() {
        return star5;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelBg;
    private javax.swing.JLabel JLabelNowPlaying;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCircleBottom1;
    private javax.swing.JLabel jLabelCircleBottom2;
    private javax.swing.JLabel jLabelCircleBottom3;
    private javax.swing.JLabel jLabelCircleBottom4;
    private javax.swing.JLabel jLabelCircleTop1;
    private javax.swing.JLabel jLabelCircleTop3;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelDateTime;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelKembalian;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelSeat;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStrips;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTotalPay;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHistory;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    // End of variables declaration//GEN-END:variables
}