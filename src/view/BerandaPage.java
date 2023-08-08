package view;

import database.CinemaDB;
import elements.ScrollBarCustom;
import entity.Movie;
import exception.MovieException;
import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import service.MovieDao;

public class BerandaPage extends javax.swing.JPanel {
    MainWindow window;

    /**
     * Creates new form BerandaPage
     * @param window
     */
    public BerandaPage(MainWindow window) {
        this.window = window;
        initComponents();
        jScrollPanelMovie.setVerticalScrollBar(new ScrollBarCustom());
    }

    public JScrollPane getjScrollPanelMovie() {
        return jScrollPanelMovie;
    }

    public JPanel getPanelMovie() {
        return panelMovie;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBeranda = new javax.swing.JPanel();
        jScrollPanelMovie = new javax.swing.JScrollPane();
        panelMovie = new javax.swing.JPanel();
        jLabelLogout = new javax.swing.JLabel();
        jLabelPoster = new javax.swing.JLabel();
        faqBtn = new javax.swing.JLabel();
        categoriesBtn = new javax.swing.JLabel();
        ticketBtn = new javax.swing.JLabel();
        profileButton = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        taskBar = new javax.swing.JLabel();
        judulFrame = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelBeranda.setPreferredSize(new java.awt.Dimension(1200, 800));
        panelBeranda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPanelMovie.setBorder(null);

        panelMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMovie.setPreferredSize(new java.awt.Dimension(100, 806));

        javax.swing.GroupLayout panelMovieLayout = new javax.swing.GroupLayout(panelMovie);
        panelMovie.setLayout(panelMovieLayout);
        panelMovieLayout.setHorizontalGroup(
            panelMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
        );
        panelMovieLayout.setVerticalGroup(
            panelMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        jScrollPanelMovie.setViewportView(panelMovie);
        panelMovie.setBackground(new java.awt.Color(0,0,0,1));
        panelMovie.setOpaque(false);

        panelBeranda.add(jScrollPanelMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1120, 340));
        jScrollPanelMovie.setBackground(new java.awt.Color(0,0,0,1));
        jScrollPanelMovie.getViewport().setOpaque(false);
        jScrollPanelMovie.setBorder(BorderFactory.createEmptyBorder());
        jScrollPanelMovie.setOpaque(false);

        jLabelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        jLabelLogout.setToolTipText("Logout");
        jLabelLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });
        panelBeranda.add(jLabelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, -1, -1));

        jLabelPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/poster.jpeg"))); // NOI18N
        panelBeranda.add(jLabelPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        faqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fq.png"))); // NOI18N
        faqBtn.setToolTipText("About Us");
        faqBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqBtnMouseClicked(evt);
            }
        });
        panelBeranda.add(faqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 710, -1, -1));

        categoriesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Category.png"))); // NOI18N
        categoriesBtn.setToolTipText("Histori Tiket");
        categoriesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoriesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriesBtnMouseClicked(evt);
            }
        });
        panelBeranda.add(categoriesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, -1, -1));

        ticketBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ticket.png"))); // NOI18N
        ticketBtn.setToolTipText("Pemesanan Tiket");
        ticketBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticketBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketBtnMouseClicked(evt);
            }
        });
        panelBeranda.add(ticketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 720, -1, -1));

        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N
        profileButton.setToolTipText("Informasi Akun");
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        panelBeranda.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, -1));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-home.png"))); // NOI18N
        homeBtn.setToolTipText("Beranda");
        panelBeranda.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        taskBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-taskbar.png"))); // NOI18N
        panelBeranda.add(taskBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, -1, -1));

        judulFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/title.png"))); // NOI18N
        panelBeranda.add(judulFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        panelBeranda.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-beranda.png"))); // NOI18N
        panelBeranda.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 820));

        add(panelBeranda, "card13");
    }// </editor-fold>//GEN-END:initComponents

    private void faqBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqBtnMouseClicked
        // TODO add your handling code here:
        window.getWindowController().tampilHalamanAnggotaKelompok(window);
    }//GEN-LAST:event_faqBtnMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        // TODO add your handling code here:
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar dari akun ?", "Logout Akun", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION) {
            window.getWindowController().tampilHalamanLogin(window);
        }
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        JOptionPane.showMessageDialog(this, "FITUR SEDANG DALAM TAHAP PENGEMBANGAN");
    }//GEN-LAST:event_profileButtonMouseClicked

    private void ticketBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketBtnMouseClicked
        JOptionPane.showMessageDialog(this, "FITUR SEDANG DALAM TAHAP PENGEMBANGAN");
    }//GEN-LAST:event_ticketBtnMouseClicked

    private void categoriesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesBtnMouseClicked
        JOptionPane.showMessageDialog(this, "FITUR SEDANG DALAM TAHAP PENGEMBANGAN");
    }//GEN-LAST:event_categoriesBtnMouseClicked

    public void loadDatabase() throws SQLException, MovieException, IOException {
        MovieDao dao = CinemaDB.getMovie();
        List<Movie> movies = dao.selectAllMovie();
        
        panelMovie.removeAll();
        panelMovie.repaint();
        panelMovie.revalidate();
          
        panelMovie.setLayout(new GridLayout(0, 4));        
        panelMovie.setPreferredSize(new Dimension(0, 3500));
        
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            
            // Grid panel
            final JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new CardLayout(10, 10));
            contentPanel.setPreferredSize(new Dimension(250, 400));
            contentPanel.setBackground(new java.awt.Color(0,0,0,1));

            // poster
            JLabel poster = new JLabel();
            BufferedImage icon = ImageIO.read(getClass().getResource(movie.getPoster()));              
            BufferedImage roundedPosterImage = makeRoundedCorner(icon, 20);
            Image scaledPoster = roundedPosterImage.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
            ImageIcon iconPoster = new ImageIcon(scaledPoster);
            poster.setPreferredSize(new Dimension(250, 400));
            poster.setIcon(iconPoster);
            
            poster.setCursor(new Cursor(Cursor.HAND_CURSOR));
            poster.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        window.getWindowController().tampilHalamanDetailMovie(window, movie);
                    } catch (IOException ex) {
                        Logger.getLogger(BerandaPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                   
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    
                }

                @Override
                public void mouseExited(MouseEvent e) {
                   
                }
            });

//            cardPanel.add(poster);
            contentPanel.add(poster);
            panelMovie.add(contentPanel);

        }   
    }
    
    public BufferedImage makeRoundedCorner(BufferedImage image, int cornerRadius) {
        int w = image.getWidth();
        int h = image.getHeight();
        BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = output.createGraphics();

        // This is what we want, but it only does hard-clipping, i.e. aliasing
        // g2.setClip(new RoundRectangle2D ...)
        // so instead fake soft-clipping by first drawing the desired clip shape
        // in fully opaque white with antialiasing enabled...
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius, cornerRadius));

        // ... then compositing the image on top,
        // using the white shape from above as alpha source
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(image, 0, 0, null);

        g2.dispose();

        return output;
    }

    public JPanel getPanelBeranda() {
        return panelBeranda;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel categoriesBtn;
    private javax.swing.JLabel faqBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelPoster;
    private javax.swing.JScrollPane jScrollPanelMovie;
    private javax.swing.JLabel judulFrame;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBeranda;
    private javax.swing.JPanel panelMovie;
    private javax.swing.JLabel profileButton;
    private javax.swing.JLabel taskBar;
    private javax.swing.JLabel ticketBtn;
    // End of variables declaration//GEN-END:variables
}
