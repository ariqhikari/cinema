/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.CinemaDB;
import entity.Movie;
import exception.MovieException;
import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import service.MovieDao;

/**
 *
 * @author ariqhikari
 */
public class BerandaPage extends javax.swing.JPanel {

    /**
     * Creates new form BerandaPage
     */
    public BerandaPage() {
        initComponents();
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

        panelMovie.setPreferredSize(new java.awt.Dimension(100, 806));

        javax.swing.GroupLayout panelMovieLayout = new javax.swing.GroupLayout(panelMovie);
        panelMovie.setLayout(panelMovieLayout);
        panelMovieLayout.setHorizontalGroup(
            panelMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        panelMovieLayout.setVerticalGroup(
            panelMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        jScrollPanelMovie.setViewportView(panelMovie);

        panelBeranda.add(jScrollPanelMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1120, 340));

        jLabelPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/poster.jpeg"))); // NOI18N
        panelBeranda.add(jLabelPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        faqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fq.png"))); // NOI18N
        panelBeranda.add(faqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 710, -1, -1));

        categoriesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Category.png"))); // NOI18N
        panelBeranda.add(categoriesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, -1, -1));

        ticketBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ticket.png"))); // NOI18N
        panelBeranda.add(ticketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 720, -1, -1));

        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N
        panelBeranda.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, -1));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-home.png"))); // NOI18N
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

    public void loadDatabase() throws SQLException, MovieException, MalformedURLException, IOException {
        MovieDao dao = CinemaDB.getMovie();
        List<Movie> movies = dao.selectAllMovie();
          
        panelMovie.setLayout(new GridLayout(0, 4));        
        panelMovie.setPreferredSize(new Dimension(0, 2500));
        panelMovie.setOpaque(false);
        jScrollPanelMovie.setOpaque(false);
        
//        for (int i = 1; i <= movies.size()-1; i++) {
//            panelMovie.add(new JButton(movies.get(i).getTitle()));
//        }
        
        for (int i = 0; i < movies.size(); i++) {
            // Grid panel
            final JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new CardLayout(10, 10));
            contentPanel.setPreferredSize(new Dimension(250, 400));
//            contentPanel.setBackground(Color.decode("#42382F"));

            // Card Panel
            final JPanel cardPanel = new JPanel();
            cardPanel.setBorder(BorderFactory.createEmptyBorder());
            cardPanel.setLayout(null);
            cardPanel.setSize(250, 400);
//            cardPanel.setBackground(Color.decode("#95ABE5"));

            JLabel poster = new JLabel();
            BufferedImage icon = ImageIO.read(new URL(movies.get(i).getPoster()));
            BufferedImage roundedPosterImage = makeRoundedCorner(icon, 12);
            Image scaledPoster = roundedPosterImage.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
            ImageIcon iconPoster = new ImageIcon(scaledPoster);
            poster.setPreferredSize(new Dimension(250, 400));
            ImageIcon posterIcon;
            posterIcon = new ImageIcon(icon);

            poster.setIcon(iconPoster);
            poster.setBounds(0, 0, 250, 400);

            // Title
            JLabel titleLabel = new JLabel(movies.get(i).getTitle());
            titleLabel.setForeground(Color.WHITE);
            titleLabel.setFont(new Font("Serif", Font.PLAIN, 18));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel.setBounds(0, poster.getHeight() - 80, poster.getWidth(), 11);
            cardPanel.add(titleLabel);
            titleLabel.setVisible(true);
            titleLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            cardPanel.add(poster);

            contentPanel.add(cardPanel);
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
